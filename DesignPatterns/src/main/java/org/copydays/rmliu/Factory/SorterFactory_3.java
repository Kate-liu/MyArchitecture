//package org.copydays.rmliu.Factory;
//
//import java.io.IOException;
//import java.util.Properties;
//
//public class SorterFactory_3 {
//    private final static Properties IMPLS = loadImpls();
//
//    private static Properties loadImpls() {
//        Properties defaultImpls = new Properties();
//        Properties impls = new Properties(defaultImpls);
//
//        defaultImpls.setProperty("sorter", "demo.sort.impl.BubbleSorter");
//
//        try {
//            impls.load(SorterFactory_3.class.getResourceAsStream("sort.properties"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        return impls;
//    }
//
//    @SuppressWarnings("unchecked")
//    public static <T> Sorter<T> getSorter() {
//        String implClassName = IMPLS.getProperty("sorter");
//
//        try {
//            Class implClass = Class.forName(implClassName);
//
//            return (Sorter<T>) implClass.newInstance();
//        } catch (Exception e) {
//            throw new IllegalArgumentException("Illegal class name: " + implClassName, e);
//        }
//    }
//}
