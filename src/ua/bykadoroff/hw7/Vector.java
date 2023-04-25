package ua.bykadoroff.hw7;

import java.util.concurrent.ThreadLocalRandom;

public class Vector {
    protected double x;
    protected double y;
    protected double z;

    public Vector() {

    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {

        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + this.x +
                ", y=" + this.y +
                ", z=" + this.z +
                '}';
    }

    public Vector vectorProduct(Vector vector) {
        double x = this.y * vector.z - this.z * vector.y;
        double y = this.z * vector.x - this.x * vector.z;
        double z = this.x * vector.y - this.y * vector.x;
        return new Vector(x, y, z);
    }

    public double cosVector(Vector vector) {
        return (this.x * vector.x + this.y * vector.y + this.z * vector.z)
                / ((Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z)) *
                (Math.sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z)));
    }

    public Vector sumVector(Vector vector) {
        double x = this.x + vector.x;
        double y = this.y + vector.y;
        double z = this.z + vector.z;
        return new Vector(x, y, z);
    }

    public Vector differenceVector(Vector vector) {
        double x = this.x - vector.x;
        double y = this.y - vector.y;
        double z = this.z - vector.z;
        return new Vector(x, y, z);
    }

    public static Vector[] arrayVectors(int n) {
        Vector[] array = new Vector[n];
        for (int i = 0; i < array.length; i++) {
            double x = ThreadLocalRandom.current().nextDouble(-100.0, 100.0);
            double y = ThreadLocalRandom.current().nextDouble(-100.0, 100.0);
            double z = ThreadLocalRandom.current().nextDouble(-100.0, 100.0);
            array[i] = new Vector(x, y, z);
        }
        return array;
    }

    public static void showVectors(Vector[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
