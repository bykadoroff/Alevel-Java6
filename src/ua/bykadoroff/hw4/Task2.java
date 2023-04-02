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
                // Начинаем цикл с 2, т к это первое простое число
                for (int j = 2; j < mass[i]; j++)
                    if (mass[i] % j == 0) {
                        simple = false;
                        //       System.out.println(mass[i] + " не простое т к " + mass[i] + " делится на " + j);
                        break;
                    }
// если указать simple = true, то будет неправильно работать - это я больше себе пометку написал.
                if (simple) {
                    //    System.out.println(mass[i] + " простое ");
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
            // System.out.println("nums [" + i +"] " + nums[i]);
        }
        return nums;
    }

}
