package ua.bykadoroff.hw5;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = fillArrayVeryVeryVeryStrangeWay(6, 6);

    }

    public static int[][] fillArrayVeryVeryVeryStrangeWay(int size1, int size2) {
        int array[][] = new int[size1][size2];
        int num = 1;
        int sign = -1;

        for (int i = 0; i < array.length; i++) {

            if (i % 2 != 0) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = (num++) * (sign);
                    System.out.print(array[i][j] + "\t   ");
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = num++;
                    System.out.print(array[i][j] + "\t   ");
                }
            }
            System.out.println();
        }
        return array;
    }
}
