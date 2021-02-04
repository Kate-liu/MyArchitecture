package org.copydays.rmliu.hash;

public class JdkHashStrategy implements HashStrategy {

    @Override
    public int getHash(String key) {
        return Math.abs(key.hashCode());
    }

}
