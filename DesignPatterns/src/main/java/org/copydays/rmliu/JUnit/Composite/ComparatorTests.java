//package org.copydays.rmliu.JUnit.Composite;
//
//import junit.framework.TestCase;
//
//import java.util.Comparator;
//
//public abstract class ComparatorTests<T> extends TestCase {
//    protected T o1;
//    protected T o2;
//    protected boolean ascending;
//    protected boolean isBefore;
//
//    public ComparatorTests(T o1, T o2, boolean ascending, boolean isBefore) {
//        super("testIsBefore");
//
//        this.o1 = o1;
//        this.o2 = o2;
//        this.ascending = ascending;
//        this.isBefore = isBefore;
//    }
//
//    public void testIsBefore() {
//        assertEquals(isBefore, createComparator(ascending).isBefore(o1, o2));
//    }
//
//    protected abstract Comparator<T> createComparator(boolean ascending);
//
//}
