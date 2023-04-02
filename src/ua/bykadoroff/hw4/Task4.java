package ua.bykadoroff.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task4 {
    public static void main(String[] args) {
        int[] array = fillAndCreateArray(2000);
        System.out.println(Arrays.toString(array));
        changeEvenNumbers(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] changeEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] fillAndCreateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 20);
        }
        return array;
    }
}
