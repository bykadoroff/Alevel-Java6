package ua.bykadoroff.hw13;

public class LinearSearch {

    public static int linearSearch(int[] array, int elementToSearch) {

        if (array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

}
