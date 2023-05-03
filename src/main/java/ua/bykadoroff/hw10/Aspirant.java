package ua.bykadoroff.hw10;

public class Aspirant extends Student {
    String aspirantWork;

    public Aspirant(String firstName, String lastName, String group, String aspirantWork, double score) {
        super(firstName, lastName, group, score);
        this.aspirantWork = aspirantWork;
    }

    public Aspirant() {

    }

    @Override
    public double getScholarship() {
        if (averageMark == 5.0) {
            return 200.0;
        } else return 180.0;
    }

}
