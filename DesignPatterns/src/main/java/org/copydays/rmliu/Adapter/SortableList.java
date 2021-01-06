package org.copydays.rmliu.Adapter;

import java.util.ArrayList;

public class SortableList<T> extends ArrayList<T> implements NewSortable<T> {

    @Override
    public T getElement(int i) {
        return get(i);
    }

    @Override
    public void setElement(int i, T o) {
        set(i, o);
    }
}
