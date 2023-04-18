package ua.bykadoroff.hw7;

import static ua.bykadoroff.hw7.Vector.arrayVectors;
import static ua.bykadoroff.hw7.Vector.showVectors;

public class Task2 {
    public static void main(String[] args) {

        Vector vector1 = new Vector(-33,4,87);
        Vector vector2 = new Vector(45,42,-687);
        System.out.println(vector2.length());
        System.out.println(vector1.vectorProduct(vector2));
        System.out.println(vector1.cosVector(vector2));
        System.out.println(vector1.sumVector(vector2));
        System.out.println(vector1.differenceVector(vector2));

        System.out.println();

        showVectors(arrayVectors(6));
    }
}
