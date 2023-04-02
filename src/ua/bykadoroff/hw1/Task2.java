package ua.bykadoroff.hw1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.print("Введите любое целое число в диапозоне Int: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);
        int reversed = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Вы ввели число " + number + ", а наоборот будет " + reversed);
    }
}
