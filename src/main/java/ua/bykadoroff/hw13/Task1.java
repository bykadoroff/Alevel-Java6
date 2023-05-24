package ua.bykadoroff.hw13;


import java.util.concurrent.ThreadLocalRandom;

public class Task1 {

    public static void main(String[] args) {

        long startTime;
        long endTime;
        long spentTime;

        int[] smallArray = {4, 5, 9, 11, 77, 0, 6, 6, 1, 0}; // 10 elements
        int[] bigArray = new int[100_000];
        fillArray(bigArray);

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();


        // System.out.println("Bubble sort for small array with 10 elements");

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(smallArray);
        endTime = System.nanoTime();
        spentTime = endTime - startTime;
        long spentTimeBubbleSortWithSmallArray = spentTime;

        // System.out.println("Bubble sort for array with 100_000 int elements");

        startTime = System.nanoTime();
        bubbleSort.bubbleSort(bigArray);
        endTime = System.nanoTime();
        spentTime = endTime - startTime;
        long spentTimeBubbleSortWithBigArray = spentTime;

        System.out.println("Bubble sort Total : ");
        System.out.println("Array with " + smallArray.length + " elements took (nanosec) : " + spentTimeBubbleSortWithSmallArray);
        System.out.println("Array with " + bigArray.length + " elements took (nanosec) : " + spentTimeBubbleSortWithBigArray);
        System.out.println("Difference between arrays.length = " + (bigArray.length / smallArray.length));
        System.out.println("Difference in time spent on sorting between " + smallArray.length + " and " + bigArray.length + " elements arrays = " + ((spentTimeBubbleSortWithBigArray / spentTimeBubbleSortWithSmallArray)));
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        // System.out.println("Bubble sort for small array with 10 elements");

        startTime = System.nanoTime();
        quickSort.quickSort(smallArray, 0, smallArray.length - 1);
        endTime = System.nanoTime();
        spentTime = endTime - startTime;
        long spentTimeQuickSortWithSmallArray = spentTime;

        // System.out.println("Quick sort for array with 100_000 int elements");

        startTime = System.nanoTime();
        quickSort.quickSort(bigArray, 0, bigArray.length - 1);
        endTime = System.nanoTime();
        spentTime = endTime - startTime;
        long spentTimeQuickSortWithBigArray = spentTime;

        System.out.println("Quick sort Total : ");
        System.out.println("Array with " + smallArray.length + " elements took (nanosec) : " + spentTimeQuickSortWithSmallArray);
        System.out.println("Array with " + bigArray.length + " elements took (nanosec) : " + spentTimeQuickSortWithBigArray);
        System.out.println("Difference between arrays.length = " + (bigArray.length / smallArray.length));
        System.out.println("Difference in time spent on sorting between " + smallArray.length + " and " + bigArray.length + " elements arrays = " + ((spentTimeQuickSortWithBigArray / spentTimeQuickSortWithSmallArray)));
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 300);
        }
    }
}
