package ua.bykadoroff.hw5;

public class Practice1 {
    public static void main(String[] args) {
        int goods[] = {112, 4534, 56, 540, 1560, 650, 3500, 453, 6700, 432, 421, 1280};
        System.out.println(costMore1000(goods));
    }

    public static int costMore1000(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1000) {
                sum += array[i];
            }
        }
        return sum;
    }
}
