package ua.bykadoroff.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class Practice2Test {

    /* AverageBoysHeight */
    @Test
    public void testAverageBoysHeightWithNegativeNums() {
        int[] arrayNegativeNums = {-90, -100, -180, -165, -150};
        assertEquals(137.0, Practice2.averageBoysHeight(arrayNegativeNums), 0.001);
    }

    @Test
    public void testAverageBoysHeightWithPositiveNums() {
        int[] arrayPositiveNums = {90, 100, 180, 165, 150};
        assertEquals(Double.NaN, Practice2.averageBoysHeight(arrayPositiveNums), 0.001);
    }

    @Test
    public void testAverageBoysHeightWithComboNums() {
        int[] arrayComboNums = {90, -100, 180, -165, -150};
        assertEquals(138.333, Practice2.averageBoysHeight(arrayComboNums), 0.001);
    }

    @Test
    public void testAverageBoysHeightWithEmptyArray() {
        int[] arrayEmpty = {};
        assertEquals(Double.NaN, Practice2.averageBoysHeight(arrayEmpty), 0.001);
    }

    @Test
    public void testAverageBoysHeightWithTheSameNums() {
        int[] arrayTheSameNums = {-150, -150, -150, -150, -150};
        assertEquals(150.0, Practice2.averageBoysHeight(arrayTheSameNums), 0.001);
    }

    /* AverageGirlsHeight */
    @Test
    void testAverageGirlsHeightWithNegativeNums() {
        int[] arrayNegativeNums = {-90, -100, -180, -165, -150};
        assertEquals(Double.NaN,Practice2.averageGirlsHeight(arrayNegativeNums),0.001);
    }

    @Test
    void testAverageGirlsHeightWithPositiveNums() {
        int[] arrayPositiveNums = {90, 100, 180, 165, 150};
        assertEquals(137.0,Practice2.averageGirlsHeight(arrayPositiveNums),0.001);
    }

    @Test
    void testAverageGirlsHeightWithComboNums() {
        int[] arrayComboNums = {90, -100, 180, -165, -150};
        assertEquals(135, Practice2.averageGirlsHeight(arrayComboNums), 0.001);
    }

    @Test
    void testAverageGirlsHeightWithEmptyArray() {
        int[] arrayEmpty = {};
        assertEquals(Double.NaN, Practice2.averageGirlsHeight(arrayEmpty), 0.001);
    }

    @Test
    void testAverageGirlsHeightWithTheSameNums() {
        int[] arrayTheSameNums = {150, 150, 150, 150, 150};
        assertEquals(150.0, Practice2.averageGirlsHeight(arrayTheSameNums), 0.001);
    }
}