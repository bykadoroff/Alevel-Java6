package ua.bykadoroff.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Ok, let's beat your keyboard a few seconds ... (try beat only space and letter keys) Also, i won't count numbers as the words");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("I think we have: " + amountOfWords(text) + "word(s)");
    }

    public static int amountOfWords(String someText) {

        String strArray[] = someText.split("[\\d\\s.,:;!?@#$%&*><{}]+");
        for (String words : strArray) {
            System.out.println(words);
        }
        return someText.split("[\\d\\s.,:;!?@#$%&*><{}]+").length;

    }
}
