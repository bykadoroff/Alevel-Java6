package ua.bykadoroff.hw13;

public class BinarySearch {

    public static int binarySearch(int[] array, int first, int last, int item) {
        int position;

        if (array.length == 0) {
            return -1;
        }

        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {

            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            return position;

        } else {
            return -1;
        }
    }
}
