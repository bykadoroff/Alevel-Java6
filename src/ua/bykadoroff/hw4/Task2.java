package ua.bykadoroff.hw4;

import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

    public static void main(String[] args) {

        int array[] = fillAndCreateArray(1000);
        System.out.println("count: " + primeCount(array));

    }

    public static int primeCount(int mass[]) {
        int sum = 0;

        for (int i = 0; i < mass.length; i++) {
            boolean simple = true;

            if (mass[i] != 1) {
                for (int j = 2; j < mass[i]; j++)
                    if (mass[i] % j == 0) {
                        simple = false;
                        break;
                    }
                if (simple) {
                    sum = sum + 1;
                }
            }
        }
        return sum;
    }


    public static int[] fillAndCreateArray(int size) {
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ThreadLocalRandom.current().nextInt(1, 200);
        }
        return nums;
    }

}
