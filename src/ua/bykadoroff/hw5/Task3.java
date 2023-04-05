package ua.bykadoroff.hw5;

import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = fillAndCreateNxNArray(5);
        System.out.println();
        changeLinesAndColumns(array);
    }

    public static int[][] changeLinesAndColumns(int[][] array) {
        int arrayCopy[][] = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                arrayCopy[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < arrayCopy.length; i++) {
            for (int j = 0; j < arrayCopy.length; j++) {
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
