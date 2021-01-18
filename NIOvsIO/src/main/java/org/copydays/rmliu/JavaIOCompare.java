package org.copydays.rmliu;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class JavaIOCompare {
    public static void main(String[] args) {
        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {
            final Socket socket = serverSocket.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    InputStream in = socket.getInputStream();
                    OutputStream out = socket.getOutputStream();

                    byte[] content = new byte[1024];
                    int len;
                    StringBuilder sb = new StringBuilder();

                    while ((len = in.read(content)) != -1) {
                        sb.append(content, 0, len);
                    }
                    out.write("Receive Success!\n".getBytes(StandardCharsets.UTF_8));
                    out.flush();
                    socket.shutdownOutput();

                    // ...
                }
            }).start();

        }
    }
}
