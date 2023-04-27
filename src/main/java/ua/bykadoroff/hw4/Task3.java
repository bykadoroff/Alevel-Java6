package ua.bykadoroff.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    static public void main(String[] args) {
        int[] array = fillAndCreateArray(1000);
        System.out.println("Composite numbers = " + compositeNumbers(array));
    }

    static public int compositeNumbers(int[] array) {
        int countNums = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1) {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        countNums++;
                        break;
                    }
                }
            }
        }
        return countNums;
    }

    public static int[] fillAndCreateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return array;
    }

}
