package ua.bykadoroff.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int randomNumberIs = (int) (Math.random() * 10);
        int inputtedNumber;
        int tryCount = 0;
        System.out.println(randomNumberIs);
        System.out.println("Let's play stupid game! I ALREADY generated a number from 0 up to 9. Try guess which one...");
        Scanner scanner = new Scanner(System.in);
        do {
            tryCount++;
            inputtedNumber = scanner.nextInt();
            System.out.println("Your number is " + inputtedNumber);
            if (inputtedNumber > 9 || inputtedNumber < 0) {
                System.out.println("I said between 0 and 9, your number is out of this range.");
            } else if (randomNumberIs > inputtedNumber) {
                System.out.println("Ha-ha-ha!!! No! My number is more...");
            } else if (randomNumberIs < inputtedNumber) {
                System.out.println("Haaaah!!! My number is less...");
            } else {
                System.out.println("Mmmmmm.... you guessed my number...");
            }
        } while (inputtedNumber != randomNumberIs);
        if (tryCount < 3) {
            System.out.println("You Won! You tried just " + tryCount + " times");
        } else {
            System.out.println("Ha-ha-ha. You are LOSER, anyway!!! You tried " + tryCount + " times!!!");
        }
    }

}
