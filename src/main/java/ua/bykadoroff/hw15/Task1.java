package ua.bykadoroff.hw15;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(11);
        intList.add(12);
        intList.add(15);
        intList.add(22);
        intList.add(33);

        printViaFor(intList);
        printViaForEach(intList);
        printViaWhile(intList);
        printViaIterator(intList);

    }

    public static <T> void printViaFor(ArrayList<T> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }

    public static <T> void printViaForEach(ArrayList<T> array) {
        for (T i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static <T> void printViaWhile(ArrayList<T> array) {
        int i = 0;
        while (i < array.size()) {
            System.out.print(array.get(i) + " ");
            i++;
        }
        System.out.println();
    }

    public static <T> void printViaIterator(ArrayList<T> array) {
        Iterator<T> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
