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
        return (double) Math.sqrt((x * x) + (y * y) + (z * z));
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + this.x +
                ", y=" + this.y +
                ", z=" + this.z +
                '}';
    }

    public Vector vectorProduct(Vector vector1, Vector vector2) {
        double x = vector1.y * vector2.z - vector1.z * vector2.y;
        double y = vector1.z * vector2.x - vector1.x * vector2.z;
        double z = vector1.x * vector2.y - vector1.y * vector2.x;
        return new Vector(x, y, z);
    }

    public double cosVector(Vector vector1, Vector vector2) {
        return (vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z)
                / (Math.sqrt(vector1.x * vector1.x + vector1.y * vector1.y + vector1.z * vector1.z)) *
                (Math.sqrt(vector2.x * vector2.x + vector2.y * vector2.y + vector2.z * vector2.z));
    }

    public Vector sumVector(Vector vector1, Vector vector2) {
        double x = vector1.x + vector2.x;
        double y = vector1.y + vector2.y;
        double z = vector1.z + vector2.z;
        return new Vector(x, y, z);
    }

    public Vector differenceVector(Vector vector1, Vector vector2) {
        double x = vector1.x - vector2.x;
        double y = vector1.y - vector2.y;
        double z = vector1.z - vector2.z;
        return new Vector(x, y, z);
    }

    public static Vector [] arrayVectors (int N){
        Vector [] array = new Vector [N];
        for(int i = 0; i < array.length; i ++){
            double x = ThreadLocalRandom.current().nextDouble(-100.0,100.0);
            double y = ThreadLocalRandom.current().nextDouble(-100.0,100.0);
            double z = ThreadLocalRandom.current().nextDouble(-100.0,100.0);
            array [i] = new Vector (x,y,z);
            System.out.println(array[i]);
        }
        return array;
    }

}
