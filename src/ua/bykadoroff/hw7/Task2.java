package ua.bykadoroff.hw7;

import static ua.bykadoroff.hw7.Vector.arrayVectors;
import static ua.bykadoroff.hw7.Vector.showVectors;

public class Task2 {
    public static void main(String[] args) {

        Vector olenka = new Vector(-33,4,87);
        Vector thisWay = new Vector(45,42,-687);
        System.out.println(olenka.vectorProduct(thisWay));
        System.out.println(olenka.cosVector(thisWay));
        System.out.println(olenka.sumVector(thisWay));
        System.out.println(olenka.differenceVector(thisWay));

        System.out.println();

        showVectors(arrayVectors(6));
    }
}
