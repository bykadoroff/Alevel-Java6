package ua.bykadoroff.hw14;

public class MySet<T> {

    private T[] array;
    private int arraySize;
    private int index = 0;

    MySet(int size) {
        this.arraySize = size;
        array = (T[]) new Object[size];
    }

    public void add(T element) {

        if (contains(element)) {
            return;
        }

        if (index >= array.length) {
            throw new IllegalStateException("Array is overflowed!!!");
        }

        if (!contains(element)) {
            array[index] = element;
            index++;
        }
    }

    public T get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Incorrect index !!! (index begins from Zero)" + index);
        }

        return array[index];
    }

    public void printElements() {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private boolean contains(T element) {
        for (int i = 0; i < index; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

}
