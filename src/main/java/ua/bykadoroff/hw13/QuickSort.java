package ua.bykadoroff.hw13;

public class QuickSort {

    public static int[] quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high) {
            return array;
        }
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        partition(array, low, high, opora, i, j);

        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }

        return array;
    }

    private static void partition(int[] array, int low, int high, int opora, int i, int j) {
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
    }
}
