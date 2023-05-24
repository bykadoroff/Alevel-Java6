package ua.bykadoroff.hw13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    void BubbleSortWithNegativeAndPositiveElements() {

        int[] arrayNotSorted = {1345, 56, 0, -1, -2};
        int[] arraySorted = {-2, -1, 0, 56, 1345};

        BubbleSort bubbleSort = new BubbleSort();

        assertArrayEquals(arraySorted, bubbleSort.bubbleSort(arrayNotSorted));
    }

    @Test
    void BubbleSortWithNoElements() {

        int[] arrayEmpty = new int[0];
        int[] arrayEmptyAgain = new int[0];

        BubbleSort bubbleSort = new BubbleSort();

        assertArrayEquals(arrayEmptyAgain, bubbleSort.bubbleSort(arrayEmpty));
    }
}