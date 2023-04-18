package ua.bykadoroff.hw5;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = fillArrayVeryVeryVeryStrangeWay(6, 6);
        showArrays(array);
    }

    public static int[][] fillArrayVeryVeryVeryStrangeWay(int size1, int size2) {
        int array[][] = new int[size1][size2];
        int num = 1;
        int sign = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 != 0) {
                    array[i][j] = (num++) * (sign);
                } else {
                    array[i][j] = num++;
                }
            }
        }
        return array;
    }

    public static void showArrays(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t    ");
            }
            System.out.println();
        }
    }
}
