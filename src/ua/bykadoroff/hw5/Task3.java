package ua.bykadoroff.hw5;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int[][] testArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] array = fillAndCreateNxNArray(5);
        System.out.println();
        changeLinesAndColumns(array);
        changeMatrix(array);
        changeMatrix(testArray);
        changeLinesAndColumns(testArray);

    }

    protected static void changeMatrix(int[][] mass) {
        System.out.println("by changeMatrix - Array after change rows on columns");
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass.length; j++) {
                int temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = temp;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static int[][] changeLinesAndColumns(int[][] array) {
        int arrayCopy[][] = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = arrayCopy[j][i];
                arrayCopy[j][i] = temp;
            }
        }
        for (int i = 0; i < arrayCopy.length; i++){
            for (int j=0; j < arrayCopy.length; j++ ){
                System.out.print(arrayCopy[i][j] + "\t   ");
            }
            System.out.println();
        }
            return arrayCopy;
    }

    public static int[][] fillAndCreateNxNArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(0, 51);
                System.out.print(array[i][j] + "\t   ");
            }
            System.out.println();
        }
        return array;
    }


}
