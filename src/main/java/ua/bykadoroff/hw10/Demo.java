package ua.bykadoroff.hw10;

public class Demo {
    public static void main(String[] args) {

        Student[] studentsArray = new Student[5];

        studentsArray[0] = new Student("Pasha", "Cheechekov", "Group 1", 5.0);
        studentsArray[1] = new Student("Stepan", "Gilbert", "Group 2", 4.6);
        studentsArray[2] = new Student("Dasha", "Chikotilenko", "Group 3", 4.8);
        studentsArray[3] = new Aspirant("Albert", "Vampirenko", "Group 666",
                "Blood, cats and drugs", 5);
        studentsArray[4] = new Aspirant("Mariyka", "Shtephendrouzgerg", "Group 002",
                "Ornithologists and occultism", 3.2);

        for (Student student : studentsArray) {
            System.out.println(student.getScholarship());
        }
    }
}
