package org.copydays.rmliu;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class JavaNIOCompare {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress(8888);
        ServerSocketChannel server = ServerSocketChannel.open();
        server.bind(address);
        server.configureBlocking(false);

        Selector selector = Selector.open();
        server.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            selector.select();
            Iterator<SelectionKey> keys = selector.selectedKeys().iterator();

            while (keys.hasNext()) {
                SelectionKey key = keys.next();
                ByteBuffer buffer = ByteBuffer.allocate(1024);

                if (key.isAcceptable()) {
                    ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
                    SocketChannel channel = serverSocketChannel.accept();
                    channel.configureBlocking(false);
                    channel.register(selector, SelectionKey.OP_READ);
                }

                if (key.isReadable()) {
                    SocketChannel channel = (SocketChannel) key.channel();
                    channel.read(buffer);
                    // ...
                    channel.register(selector, SelectionKey.OP_WRITE);
                }

                if (key.isWritable()) {
                    SocketChannel channel = (SocketChannel) key.channel();
                    channel.write(buffer);
                    // ...
                    channel.register(selector, SelectionKey.OP_READ);
                }

                keys.remove();
            }
        }
    }
}
