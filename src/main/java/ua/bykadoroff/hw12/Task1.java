package ua.bykadoroff.hw12;

public class Task1 {
    public static void main(String[] args) {

        try {
            throw new Exception("Some exception");
        } catch (Exception exc) {
            System.out.println(exc);
        } finally {
            System.out.println("Finally String message");
        }
    }
}

