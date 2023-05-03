package ua.bykadoroff.hw10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
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
}
