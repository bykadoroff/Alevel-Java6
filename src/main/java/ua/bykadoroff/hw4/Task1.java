package ua.bykadoroff.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int array[] = fillAndCreateArray(400);
        int arrayTest[] = {1, -2, -3, -4, 5};

        System.out.println("Arithmetic average = " + averageMath(array));
        System.out.println("Geometry mean = " + geometryMean(array));
        System.out.println(geometryMean(arrayTest));


    }

    public static double geometryMean(int[] array) {
        double multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            multiplication *= array[i];
        }
        return Math.pow(multiplication, 1.0 / array.length);
    }

    public static double averageMath(int[] array) {
        double average = 0;
        double sum = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            average = sum / array.length;
        }
        return average;
    }

    public static int[] fillAndCreateArray(int size) {
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(1, 11);
        }
        return nums;
    }

}
