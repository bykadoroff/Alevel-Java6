package ua.bykadoroff.hw10;

import java.util.Objects;

public class Aspirant extends Student {
    String aspirantWork;

    public Aspirant(String firstName, String lastName, String group, String aspirantWork, double score) {
        super(firstName, lastName, group, score);
        this.aspirantWork = aspirantWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aspirant aspirant = (Aspirant) o;
        return Objects.equals(aspirantWork, aspirant.aspirantWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), aspirantWork);
    }

    public int hashCodeObject() {
        return super.hashCode();
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
