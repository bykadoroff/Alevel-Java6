package ua.bykadoroff.hw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AspirantTest {

    @Test
    void testGetScholarshipWithEmptyAverageMarkForAspirantClass() {

        Aspirant hans = new Aspirant();
        hans.firstName = "Hans";
        hans.lastName = "Shultez";
        hans.group = "Group 1";
        hans.aspirantWork = "BMW or cycle?";

        assertEquals(180, hans.getScholarship());
    }

    @Test
    void testGetScholarshipWith5AverageMarkForAspirantClass() {
        Aspirant hans = new Aspirant("Hans", "Shultez", "Group 1", "BMW or cycle?", 5);

        assertEquals(200, hans.getScholarship());
    }

    @Test
    void testGetScholarshipWithLess5AverageMarkForAspirantClass() {
        Aspirant hans = new Aspirant("Hans", "Shultez", "Group 1", "BMW or cycle?", 3.3);

        assertEquals(180, hans.getScholarship());
    }

    @Test
    void testGetScholarshipWithZeroAverageMarkForAspirantClass() {
        Aspirant hans = new Aspirant("Hans", "Shultez", "Group 1", "BMW or cycle?", 0);

        assertEquals(180, hans.getScholarship());
    }
}