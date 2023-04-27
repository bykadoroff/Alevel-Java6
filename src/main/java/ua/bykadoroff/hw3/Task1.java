package ua.bykadoroff.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Write something, and I will try to find is that palindrome. Lets write!");
        Scanner scan = new Scanner(System.in);
        String textInput = scan.nextLine();
        System.out.println(isPalindrome(textInput));
    }

    public static String isPalindrome(String someText) {
        String textOutOfSpaces = someText.replace(" ", "");
        int textLength = textOutOfSpaces.length();
        String reverse = "";
        for (int i = 0; i < textLength; i++) {
            reverse = textOutOfSpaces.charAt(i) + reverse;
        }
        if (reverse.equals(textOutOfSpaces)) {
            return "Ho-ho-ho, it is palindrome!";
        } else return "W#@%*&#! It is not palindrome, write better next time...";
    }

}
