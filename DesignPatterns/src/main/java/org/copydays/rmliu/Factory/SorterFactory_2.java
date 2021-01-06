package org.copydays.rmliu.Factory;

public class SorterFactory_2 {
    @SuppressWarnings("unchecked")
    public static <T> Sorter<T> getSorter(String implClass) {
        try {
            Class impl = Class.forName(implClass);
            return (Sorter<T>) impl.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Illegal class name: " + implClass, e);
        }
    }
}
