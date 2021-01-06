package org.copydays.rmliu.Adapter;

import java.util.List;

public class ListSortable<T> implements NewSortable<T> {

    private final List<T> list;

    public ListSortable(List<T> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public T getElement(int i) {
        return list.get(i);
    }

    @Override
    public void setElement(int i, T o) {
        list.set(i, o);
    }
}
