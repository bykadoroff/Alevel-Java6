package ua.bykadoroff.hw4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    /* Tests for GeometryMean */
    @Test
    public void testGeometryMeanWithPositiveNumbers() {
        int[] arrayPositiveNums = {1, 2, 3, 4, 5};
        double result = 2.605171084697352;
        assertEquals(2.6051, Task1.geometryMean(arrayPositiveNums), 0.0001);
    }

    @Test
    public void testGeometryMeanWithPositiveAndNegativeNumbers() {
        int[] arrayPositiveAndNegativeNums = {1, -2, -3, -4, 5};
        assertEquals(Double.NaN, Task1.geometryMean(arrayPositiveAndNegativeNums), 0.0001);

    }

    @Test
    public void testGeometryMeanWithNegativeNumbers() {
        int[] arrayPositiveAndNegativeNums = {-1, -2, -3, -4, -5};
        assertEquals(Double.NaN, Task1.geometryMean(arrayPositiveAndNegativeNums), 0.0001);

    }

    @Test
    public void testGeometryMeanWithZero() {
        int[] arrayWithZero = {0, 1, 2, 3, 4};
        assertEquals(0, Task1.geometryMean(arrayWithZero), 0.0001);
    }

    @Test
    public void testGeometryMeanWithTheSameNumbers() {
        int[] arrayWithSameNums = {3, 3, 3, 3, 3};
        assertEquals(3, Task1.geometryMean(arrayWithSameNums), 0.0001);
    }

    @Test
    public void testGeometryMeanWithTheEmptyArray() {
        int[] arrayEmpty = new int[0];
        assertEquals(Double.NaN, Task1.geometryMean(arrayEmpty), 0.0001);
    }

    /* Tests for AverageMath */
    @Test
    public void testAverageMathWithPositiveNums() {
        int[] arrayPositiveNums = {1, 2, 3, 4, 5};
        assertEquals(3, Task1.averageMath(arrayPositiveNums), 0.0001);
    }

    @Test
    public void testAverageMathWithNegativeNums() {
        int[] arrayNegativeNums = {-1, -2, -3, -4, -5};
        assertEquals(-3, Task1.averageMath(arrayNegativeNums), 0.0001);
    }

    @Test
    public void testAverageMathWithNegativeAndPositiveNums() {
        int[] arrayComboNums = {-1, 2, -3, 4, -5};
        assertEquals(-0.6, Task1.averageMath(arrayComboNums), 0.0001);
    }

    @Test
    public void testAverageMathWithEmpty() {
        int[] arrayEmpty = new int[0];
        assertEquals(0, Task1.averageMath(arrayEmpty), 0.0001);
    }

    @Test
    public void testAverageMathWithTheSameNums() {
        int[] arrayTheSameNums = {3, 3, 3, 3, 3};
        assertEquals(3, Task1.averageMath(arrayTheSameNums), 0.0001);


    }

}