package ua.bykadoroff.hw5;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class Task2Test {
    @Test
    public void testCheckForSortWithSortedArray() {
        int[] arraySorted = {1, 2, 3, 4, 5};
        assertTrue(Task2.checkForSort(arraySorted));
    }

    @Test
    public void testCheckForSortWithUnsortedArray() {
        int[] arrayUnsorted = {2, 5, 1, 4, 3};
        assertFalse(Task2.checkForSort(arrayUnsorted));
    }

    @Test
    public void testCheckForSortWithTheSameNumbersArray() {
        int[] arrayTheSameNumbers = {2, 2, 2, 2, 2};
        assertTrue(Task2.checkForSort(arrayTheSameNumbers));
    }

    @Test
    public void testCheckForSortWithEmptyArray() {
        int[] arrayEmpty = new int[0];
        assertTrue(Task2.checkForSort(arrayEmpty));
    }
}
