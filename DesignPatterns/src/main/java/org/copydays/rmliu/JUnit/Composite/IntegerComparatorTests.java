//package org.copydays.rmliu.JUnit.Composite;
//
//import junit.framework.Test;
//import junit.framework.TestSuite;
//
//import java.util.Comparator;
//
//public class IntegerComparatorTests extends ComparatorTests<Integer> {
//
//    public static Test suite() {
//        TestSuite suite = new TestSuite("IntegerComparatorTests");
//
//        suite.addTest(new IntegerComparatorTests(1, 1, true, false));
//        suite.addTest(new IntegerComparatorTests(1, 2, true, true));
//        suite.addTest(new IntegerComparatorTests(2, 1, true, false));
//
//        suite.addTest(new IntegerComparatorTests(1, 1, false, false));
//        suite.addTest(new IntegerComparatorTests(1, 2, false, false));
//        suite.addTest(new IntegerComparatorTests(2, 1, false, true));
//
//        return suite;
//    }
//
//    public IntegerComparatorTests(Integer o1, Integer o2, boolean ascending, boolean isBefore) {
//        super(o1, o2, ascending, isBefore);
//    }
//
//    @Override
//    protected Comparator<Integer> createComparator(boolean ascending) {
//        return new IntegerCoparator(ascending);
//    }
//}
