//package org.copydays.rmliu.JUnit.Decorator;
//
//import junit.extensions.RepeatedTest;
//import junit.extensions.TestSetup;
//import junit.framework.Test;
//import junit.framework.TestSuite;
//import org.copydays.rmliu.JUnit.BubbleSorterTests;
//
//public class PerformanceTests extends TestSetup {
//
//    private long start;
//    private int repeat;
//
//    public PerformanceTests(Test test, int repeat) {
//        super(new RepeatedTest(test, repeat));
//
//        this.repeat = repeat;
//    }
//
//    protected void setUp() {
//        start = System.currentTimeMillis();
//    }
//
//    protected void tearDown() {
//        long duration = System.currentTimeMillis() - start;
//
//        System.out.printf("%s repeated , %d times, takes %d ms \n", getTest(), repeat, duration);
//    }
//
//    public static Test suite() {
//        TestSuite suite = new TestSuite("performance");
//
//        Test bubbleTests = new TestSuite(BubbleSorterTests.class);
//        Test insertionTests = new TestSuite(InsertionSorterTests.class);
//
//        suite.addTest(new PerformanceTests(bubbleTests, 10000));
//        suite.addTest(new PerformanceTests(insertionTests, 10000));
//
//        return suite;
//    }
//}
