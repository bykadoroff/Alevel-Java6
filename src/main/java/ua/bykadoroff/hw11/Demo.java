package ua.bykadoroff.hw11;

import ua.bykadoroff.hw10.Aspirant;
import ua.bykadoroff.hw10.Student;

public class Demo {
    public static void main(String[] args) {

        Student[] studentsArray = new Student[6];

        studentsArray[0] = new Student("Pasha", "Gilbert", "Group 1", 5.0);
        studentsArray[1] = new Student("Pasha", "Gilbert", "Group 1", 5.0);
        studentsArray[2] = new Student("Dasha", "Chikotilenko", "Group 3", 4.8);
        studentsArray[3] = new Aspirant("Albert", "Vampirenko", "Group 666",
                "Blood, cats and drugs", 5);
        studentsArray[4] = new Aspirant("Mariyka", "Shtephendrouzgerg", "Group 002",
                "Ornithologists and occultism", 3.2);
        studentsArray[5] = new Aspirant("Albert", "Vampirenko", "Group 666",
                "Blood, cats and drugs", 5);

        for (Student student : studentsArray) {
            System.out.println(student.getScholarship());
        }

        System.out.println(studentsArray[0].equals(studentsArray[1]));
        System.out.println(studentsArray[3].equals(studentsArray[5]));
        System.out.println(studentsArray[0].hashCode());
        System.out.println(studentsArray[1].hashCode());
        System.out.println("studentsArray 3 " + studentsArray[3].hashCode());
        System.out.println("studentsArray 5 " + studentsArray[5].hashCode());
    }
}
