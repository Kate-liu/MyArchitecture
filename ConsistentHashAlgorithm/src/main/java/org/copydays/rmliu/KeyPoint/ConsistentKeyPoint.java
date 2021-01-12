package org.copydays.rmliu.KeyPoint;

import org.copydays.rmliu.ConsistentHashing;

import javax.xml.soap.Node;
import java.util.SortedMap;
import java.util.TreeMap;

import static java.util.Objects.hash;

public class ConsistentKeyPoint {
    public static void main(String[] args) {
        SortedMap<Integer, String> hashCircle = new TreeMap<Integer, String>();

//        // 初始化一致性 hash 环
//        for (Node node : nodes) {
//            for (int i = 0; i < virtualNums; i++) {
//                hashCircle.put(hash(node.toString() + i), node);
//            }
//        }

        // 计算key 对应的服务器node
//        int hash = getHash(key);  // 计算 key 的hash值
//        if (!hashCircle.containsKey(hash)) {  // key 的 hash 值是否和虚拟节点的hash相同
//            SortedMap<Integer, String> tailMap = hashCircle.tailMap(hash);  // key 的右子树
//            hash = tailMap.isEmpty() ? hashCircle.firstKey() : tailMap.firstKey();
//        }

//        return hashCircle.get(hash);
    }
}
