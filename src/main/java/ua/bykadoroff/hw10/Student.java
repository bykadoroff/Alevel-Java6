package ua.bykadoroff.hw10;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = score;
    }

    public Student() {

    }

    public double getScholarship() {
        if (averageMark == 5.0) {
            return 100.0;
        } else return 80.0;
    }

}
