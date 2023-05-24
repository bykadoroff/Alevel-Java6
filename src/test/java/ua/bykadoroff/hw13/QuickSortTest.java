package ua.bykadoroff.hw13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    @Test
    void QuickSortWithNegativeAndPositiveElements() {

        int[] arrayNotSorted = {1345, 56, 0, -1, -2};
        int[] arraySorted = {-2, -1, 0, 56, 1345};

        QuickSort quickSort = new QuickSort();

        assertArrayEquals(arraySorted, quickSort.quickSort(arrayNotSorted, 0, arrayNotSorted.length - 1));
    }

    @Test
    void QuickSortWithNoElements() {

        int[] arrayEmpty = new int[0];
        int[] arrayEmptyAgain = new int[0];

        QuickSort quickSort = new QuickSort();

        assertArrayEquals(arrayEmptyAgain, quickSort.quickSort(arrayEmpty, 0, arrayEmpty.length - 1));
    }
}