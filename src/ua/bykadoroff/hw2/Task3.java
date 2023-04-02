package ua.bykadoroff.hw2;

public class Task3 {

    public static void main(String[] args) {

        System.out.println(lessNumber(-3, 0, -1));
        System.out.println(lessModule(0, -55, 2));

    }

    /* это замена знака на по любому положительный, хотя я думал, что тернарка нужна как раз для всего остального */
    public static int absoluteValue(int number) {
        return (number >= 0) ? number : -number;
    }

    public static int lessNumber(int number1, int number2, int number3) {
        if (absoluteValue(number1) < absoluteValue(number2) && absoluteValue(number1) < absoluteValue(number3)) {
            return number1;
        } else if (absoluteValue(number2) < absoluteValue(number1) && absoluteValue(number2) < absoluteValue(number3)) {
            return number2;
        } else
            return number3;
    }

    /* решение, которое ниже, оно сразу всё делает и компактное */
    public static int lessModule(int number1, int number2, int number3) {
        int result;
        int temp = Math.min(Math.abs(number1), Math.abs(number2));
        result = Math.min(temp, Math.abs(number3));
        return result;
    }

}
