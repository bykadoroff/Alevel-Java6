package ua.bykadoroff.hw14;

public class Main {
    public static void main(String[] args) {

        MySet<Integer> mySet = new MySet<>(3);
        mySet.add(6);
        mySet.add(66);
        mySet.add(55);
        mySet.add(55);
        mySet.printElements();

        Task2.printValue("String Strong Strung");

        Integer[] intNumbers = {1, 77, 44, 55, 3333};

        Task2 utility = new Task2();
        utility.printArray(intNumbers);

    }
}
