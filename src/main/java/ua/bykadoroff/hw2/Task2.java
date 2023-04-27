package ua.bykadoroff.hw2;

public class Task2 {
    public static void main(String[] args) {
        evenOrOdd(121345);
    }

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else System.out.println(number + " is odd number");
    }
}
