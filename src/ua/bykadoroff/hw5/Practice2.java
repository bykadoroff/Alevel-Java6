package ua.bykadoroff.hw5;

public class Practice2 {
    public static void main(String[] args) {
        int students[] = {156, -186, 167, 175, 178, -182, -175, 174, 178, 180, -181, -168, 175, 156, -186, 167, 175, 178, -182, -175, 174, 178, 180, -181, -168};
        System.out.println(averageBoysHeight(students));
        System.out.println(averageGirlsHeight(students));
    }

    public static double averageBoysHeight(int[] array) {
        double heightsOfAllBoys = 0;
        int boysAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = Math.abs(array[i]);
                boysAmount++;
                heightsOfAllBoys += array[i];
            }
        }
        double  averageHeight = heightsOfAllBoys / boysAmount;
        return averageHeight;
    }

    public static double averageGirlsHeight(int[] array) {
        double heightsOfAllGirls = 0;
        int girlsAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                girlsAmount++;
                heightsOfAllGirls += array[i];
            }
        }
        double averageHeight = heightsOfAllGirls / girlsAmount;
        return averageHeight;
    }
}
