package org.copydays.rmliu.Factory;

public class Client_2 {
    public static void main(String[] args) {
        Integer[] array = {5, 4, 9, 7, 6, 3, 8, 1, 0, 2};

        Sorter<Integer> sorter = SorterFactory_2.getSorter("demo.sort.impl.BubbleSorter");
        Sortable<Integer> sortable = SorterableFactory.getSortable(array);

        Comparator<Integer> comparator = ComparatorFactory.getComparator();

        sorter.sort(sortable, comparator);
        // ...

    }
}
