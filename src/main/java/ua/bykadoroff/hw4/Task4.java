package ua.bykadoroff.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {
    public static void main(String[] args) {
        int[] array = fillAndCreateArray(2000);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(changeEvenNumbers(array)));
    }

    public static int[] changeEvenNumbers(int[] array) {
        int[] arrayCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
            if (arrayCopy[i] % 2 == 0) {
                arrayCopy[i] = 0;
            }
        }
        return arrayCopy;
    }

    public static int[] fillAndCreateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 20);
        }
        return array;
    }
}
