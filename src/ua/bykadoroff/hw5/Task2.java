package ua.bykadoroff.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

    public static void main(String[] args) {
        int[] array = fillAndCreateArray(100);
        System.out.println(Arrays.toString(array));
        System.out.println(checkForSort(array));
        System.out.println(Arrays.toString(bubbleSort(array)));
        System.out.println(checkForSort(bubbleSort(array)));
    }

    public static boolean checkForSort(int[] array) {
        boolean isSorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[i]) {
                isSorted = true;
                continue;
            } else isSorted = false;
            break;
        }
        return isSorted;
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] fillAndCreateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 51);
        }
        return array;
    }


}
