package ua.bykadoroff.hw2;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(triangleSquare(1, 5, 3, 5, 6, 7));

    }

    public static double triangleSquare(double x1, double y1, double x2, double y2, double x3, double y3) {
        double square;
        square = 0.5 * (Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)));
        return square; // я понимаю что можно сразу вернуть всё выражение, но все же так понятнее
    }


}
