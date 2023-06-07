package ua.bykadoroff.hw13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testBinarySearchWithArray() {

        BinarySearch binarySearch = new BinarySearch();
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        assertEquals(9, binarySearch.binarySearch(array,0, array.length - 1, 10 ));
    }

    @Test
    void testBinarySearchWithNotSortedArray() {

        BinarySearch binarySearch = new BinarySearch();
        int [] array = {10,9,8,7,6,5,4,3,2,1};

        assertEquals(-1, binarySearch.binarySearch(array,0, array.length - 1, 10 ));
    }

    @Test
    void testBinarySearchWithEmptyArray() {

        BinarySearch binarySearch = new BinarySearch();
        int [] array = new int[0];

        assertEquals(-1, binarySearch.binarySearch(array,0, array.length - 1, 10 ));
    }

    @Test
    void testBinarySearchWithRepeatElementsArray() {
        // Этот тест сомнительный

        BinarySearch binarySearch = new BinarySearch();
        int [] array = {-1,-1,1,1,1,1,1,8,9,10};

        assertEquals(1, binarySearch.binarySearch(array,0, array.length - 1, -1 ));
    }

    @Test
    void testBinarySearchWithArrayWithoutElement() {

        BinarySearch binarySearch = new BinarySearch();
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        assertEquals(-1, binarySearch.binarySearch(array, 0, array.length - 1, 1547));
    }
}