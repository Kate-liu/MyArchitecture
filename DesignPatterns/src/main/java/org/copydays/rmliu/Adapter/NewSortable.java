package org.copydays.rmliu.Adapter;

public interface NewSortable<T> {
    int size();

    T getElement(int i);

    void setElement(int i, T o);
}
