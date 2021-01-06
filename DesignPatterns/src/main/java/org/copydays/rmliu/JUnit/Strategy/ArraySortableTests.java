package org.copydays.rmliu.JUnit.Strategy;

import org.copydays.rmliu.Adapter.ListSortable;

import java.lang.reflect.Array;
import java.util.List;

public class ArraySortableTests extends SortableTests {

    @Override
    protected Sortable<Integer> createSortable(Integer[] data) {
        List<Integer> list = Array.asList(data);
        return new ListSortable<Integer>(list);
    }
}
