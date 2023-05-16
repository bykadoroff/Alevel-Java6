package ua.bykadoroff.hw10;


import java.util.Objects;


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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.averageMark, averageMark) == 0 &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, group, averageMark);
    }

    public Student() {

    }

    public double getScholarship() {
        if (averageMark == 5.0) {
            return 100.0;
        } else return 80.0;
    }

}
