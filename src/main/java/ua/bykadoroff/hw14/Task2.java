package ua.bykadoroff.hw14;

public class Task2<T> {

    public static <T> void printValue(T value) {
        System.out.println(" ***{" + value + "}***");
    }

    public <T> void printArray(T [] array){
        for(T element: array){
            System.out.print(element + " ");
        }

    }

}
