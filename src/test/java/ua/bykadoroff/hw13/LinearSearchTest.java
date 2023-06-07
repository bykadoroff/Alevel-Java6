package ua.bykadoroff.hw13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void LinearSearch() {
    }

    @Test
    void testLinearSearchWithArray() {

        LinearSearch linearSearch = new LinearSearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(9, linearSearch.linearSearch(array, 10));
    }

    @Test
    void testLinearSearchWithNotSortedArray() {

        LinearSearch linearSearch = new LinearSearch();
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        assertEquals(-1, linearSearch.linearSearch(array, 10));
    }

    @Test
    void testLinearSearchWithEmptyArray() {

        LinearSearch linearSearch = new LinearSearch();
        int[] array = new int[0];

        assertEquals(-1, linearSearch.linearSearch(array, 10));
    }

    @Test
    void testLinearSearchWithRepeatElementsArray() {

        LinearSearch linearSearch = new LinearSearch();
        int[] array = {-1, -1, 1, 1, 1, 1, 1, 8, 9, 10};

        assertEquals(2, linearSearch.linearSearch(array, 1));
    }

    @Test
    void testLinearSearchWithArrayWithoutElement() {

        LinearSearch linearSearch = new LinearSearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(-1, linearSearch.linearSearch(array,  1547));
    }
}