package ua.bykadoroff.hw15;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(11);
        intList.add(12);
        intList.add(15);
        intList.add(22);
        intList.add(33);

        System.out.println(getSum(intList));
        System.out.println(getOddNumber(intList));
        System.out.println(convertToStringList(intList));
        System.out.println(doubling(convertToStringList(intList)));

    }

    public static Integer getSum(List<Integer> numbers) {
        Integer sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static List<Integer> getOddNumber(List<Integer> numbers) {

        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {

        List<String> strList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            strList.add(String.valueOf(numbers.get(i)));
        }
        return strList;
    }

    public static List<String> doubling(List<String> strings) {

        List<String> doubleStr = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            doubleStr.add(strings.get(i) + strings.get(i));
        }
        return doubleStr;
    }

}





