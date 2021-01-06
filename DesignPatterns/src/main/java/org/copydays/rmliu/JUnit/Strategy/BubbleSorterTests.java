//package org.copydays.rmliu.JUnit.Strategy;
//
//import junit.framework.TestCase;
//import junit.runner.Sorter;
//
//import java.util.Comparator;
//
//public class BubbleSorterTests extends TestCase {
//    private Integer[] array;
//    private Sorter sorter;
//
//    @Override
//    protected void setUp() {
//        array = new Integer[]{5, 4, 9, 7, 6, 3, 8, 1, 0, 2};
//        sorter = new BubbleSorter();
//    }
//
//    public void testSort() {
//        Sortable sortable = new ArraySortable(array);
//        Comparator comparator = new IntegerComparator();
//
//        sorter.sort(sortable, comparator);
//
//        for (int i = 0; i < 10; i++) {
//            assertEquals(i, array[i].intValue());
//        }
//    }
//}
