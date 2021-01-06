//package org.copydays.rmliu.JUnit.Decorator;
//
//import junit.framework.Assert;
//import junit.framework.Test;
//import junit.framework.TestResult;
//
//public class TestDecorator extends Assert implements Test {
//
//    protected Test fTest;
//
//    public TestDecorator(Test fTest) {
//        this.fTest = fTest;
//    }
//
//    @Override
//    public int countTestCases() {
//        return 0;
//    }

//    @Override
//    public void run(TestResult result) {
//        for (int i = 0; i < fTimesRepeat; i++) {
//            if (result.shouldStop()) {
//                beak;
//            }
//            super.run(result);
//        }
//    }
//}
