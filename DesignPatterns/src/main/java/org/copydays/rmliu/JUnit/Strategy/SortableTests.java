//package org.copydays.rmliu.JUnit;
//
//import junit.framework.TestCase;
//
//public abstract class SortableTests extends TestCase {
//    protected Sortable<Integer> sortable;
//
//    @Override
//    protected void setUp() throws Exception {
//        Integer[] data = new Integer[10];
//
//        for (int i = 0; i < 10; i++) {
//            data[i] = i;
//        }
//
//        sortable = createSortable(data);
//
//    }
//
//    protected abstract Sortable<Integer> createSortable(Integer[] data);
//
//    public final void testGet() {
//        for (int i = 0; i < 10; i++) {
//            assertEquals(i, sortable.get(i).intValue());
//        }
//
//        try {
//            sortable.get(-1);
//            fail();
//        } catch (RuntimeException e) {
//
//        }
//        try {
//            sortable.get(10);
//            fail();
//        } catch (RuntimeException e) {
//
//        }
//    }
//
//    public final void testSet() {
//        for (int i = 0; i < 10; i++) {
//            sortable.set(i, 100);
//            assertEquals(100, sortable.get(i).intValue());
//        }
//
//        try {
//            sortable.set(-1, 999);
//            fail();
//        } catch (RuntimeException e) {
//
//        }
//        try {
//            sortable.set(10, 999);
//            fail();
//        } catch (RuntimeException e) {
//
//        }
//    }
//
//    public final void testSize() {
//        assertEquals(10, sortable.size());
//    }
//}
