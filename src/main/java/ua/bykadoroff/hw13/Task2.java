package ua.bykadoroff.hw13;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {

    public static void main(String[] args) {

        long startTime;
        long endTime;
        long spentTime;

        int [] smallArray = {4,5,9,11,77,0,6,6,1,0,55,6,87,23,45,8,9,0,11,3}; // 20 elements
        int [] bigArray = new int[100_000];

        fillArray(bigArray);

        Arrays.sort(smallArray);
        Arrays.sort(bigArray);

        BinarySearch binarySearch = new BinarySearch();
        LinearSearch linearSearch = new LinearSearch();

        // System.out.println("Binary Search for small array with 20 elements");

        startTime = System.nanoTime();
        System.out.println(binarySearch.binarySearch(smallArray, 0, smallArray.length - 1, 77));
        endTime = System.nanoTime();
        spentTime = endTime - startTime;
        long spentTimeBinarySearchWithSmallArray = spentTime;

        // System.out.println("Binary Search for array with 100_000 int elements");

        startTime = System.nanoTime();
        System.out.println(binarySearch.binarySearch(bigArray,0, bigArray.length - 1, 77 ));
        endTime = System.nanoTime();
        spentTime = endTime - startTime;
        long spentTimeBinarySearchWithBigArray = spentTime;

        System.out.println("Binary Search Total : ");
        System.out.println("Array with " + smallArray.length + " elements took (nanosec) : " + spentTimeBinarySearchWithSmallArray );
        System.out.println("Array with " + bigArray.length + " elements took (nanosec) : " + spentTimeBinarySearchWithBigArray );
        System.out.println("Difference between arrays.length = " + (bigArray.length/smallArray.length));
        System.out.println("Difference in time spent on sorting between " + smallArray.length + " and " + bigArray.length + " elements arrays = " + ((spentTimeBinarySearchWithBigArray / spentTimeBinarySearchWithSmallArray)));
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        // System.out.println("Linear Search for small array with 20 elements");

        startTime = System.nanoTime();
        linearSearch.linearSearch(smallArray,77 );
        endTime = System.nanoTime();
        spentTime = endTime - startTime;
        long spentTimeLinearSearchWithSmallArray = spentTime;

        // System.out.println("Linear Search for array with 100_000 int elements");

        startTime = System.nanoTime();
        linearSearch.linearSearch(bigArray,77 );
        endTime = System.nanoTime();
        spentTime = endTime - startTime;
        long spentTimeLinearSearchWithBigArray = spentTime;

        System.out.println("Linear Search Total : ");
        System.out.println("Array with " + smallArray.length + " elements took (nanosec) : " + spentTimeLinearSearchWithSmallArray );
        System.out.println("Array with " + bigArray.length + " elements took (nanosec) : " + spentTimeLinearSearchWithBigArray );
        System.out.println("Difference between arrays.length = " + (bigArray.length/smallArray.length));
        System.out.println("Difference in time spent on sorting between " + smallArray.length + " and " + bigArray.length + " elements arrays = " + ((spentTimeLinearSearchWithBigArray / spentTimeLinearSearchWithSmallArray)));
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

    }

    public static void fillArray(int [] array){
        for (int i = 0; i < array.length; i ++){
            array[i] = ThreadLocalRandom.current().nextInt(1, 300);
        }
    }
}
