package ua.bykadoroff.hw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AspirantTest {

    // Tests for getScholarship method for Student class
    @Test
    void testGetScholarshipWithEmptyAverageMarkForStudentClass() {

        Student hans = new Student();
        hans.firstName = "Hans";
        hans.lastName = "Shultez";
        hans.group = "Group 1";

        assertEquals(80, hans.getScholarship());
    }

    @Test
    void testGetScholarshipWith5AverageMarkForStudentClass() {
        Student hans = new Student("Hans", "Shultez", "Group 1", 5);

        assertEquals(100, hans.getScholarship());
    }

    @Test
    void testGetScholarshipWithLess5AverageMarkForStudentClass() {
        Student hans = new Student("Hans", "Shultez", "Group 1", 3.3);

        assertEquals(80, hans.getScholarship());
    }

    @Test
    void testGetScholarshipWithZeroAverageMarkForStudentClass() {
        Student hans = new Student("Hans", "Shultez", "Group 1", 0);

        assertEquals(80, hans.getScholarship());
    }

    // Tests for getScholarship method for Aspirant class
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