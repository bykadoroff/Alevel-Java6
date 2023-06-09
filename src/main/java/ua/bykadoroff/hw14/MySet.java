package ua.bykadoroff.hw14;

public class MySet<T> {

    private T[] array;
    private int index = 0;

    MySet(int size) {
        array = (T[]) new Object[size];
    }

    public void add(T element) {

        if (contains(element)) {
            return;
        }

        if (index >= array.length) {
            throw new IllegalStateException("Array is overflowed!!!");
        }
        array[index] = element;
        index++;
    }

    public T get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Incorrect index !!! (index begins from Zero)" + index);
        }

        return array[index];
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        return result;
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
