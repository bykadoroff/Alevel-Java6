package ua.bykadoroff.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Practice1Test {
    @Test
    public void testCostMore1000WithPriceMore1000() {
        int[] arrayMore1000 = {1005, 2500, 3999, 1500, 10897};
        assertEquals(19_901, Practice1.costMore1000(arrayMore1000));
    }

    @Test
    public void testCostMore1000WithPriceLess1000() {
        int[] arrayLess1000 = {560, 12, 999, 567, 900};
        assertEquals(0, Practice1.costMore1000(arrayLess1000));
    }

    @Test
    public void testCostMore1000WithComboPrice() {
        int[] arrayCombo = {560, 12, 1200, 567, 3500};
        assertEquals(4700, Practice1.costMore1000(arrayCombo));
    }

    @Test
    public void testCostMore1000WithEmptyArray() {
        int[] arrayEmpty = new int[0];
        assertEquals(0, Practice1.costMore1000(arrayEmpty));
    }

    @Test
    public void testCostMore1000WithTheSamePrice() {
        int[] arrayTheSame = {1500, 1500, 1500, 1500, 1500};
        assertEquals(7500, Practice1.costMore1000(arrayTheSame));
    }

}
