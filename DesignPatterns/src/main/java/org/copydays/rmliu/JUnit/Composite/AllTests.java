//package org.copydays.rmliu.JUnit.Composite;
//
//import junit.framework.Test;
//import junit.framework.TestSuite;
//import org.copydays.rmliu.JUnit.Strategy.ArraySortableTests;
//import org.copydays.rmliu.JUnit.BubbleSorterTests;
//import org.copydays.rmliu.JUnit.ListSortableTests;
//
//public class AllTests {
//    public static Test suite() {
//        TestSuite suite = new TestSuite("sort");
//
//        suite.addTestSuite(BubbleSorterTests.class);
//        suite.addTestSuite(InsertionSorterTests.class);
//
//        suite.addTestSuite(ArraySortableTests.class);
//        suite.addTestSuite(ListSortableTests.class);
//
//        suite.addTest(IntegerComparatorTests.suite());
//        suite.addTest(ComparableComparatorTests.suite());
//
//        return suite;
//    }
//}
