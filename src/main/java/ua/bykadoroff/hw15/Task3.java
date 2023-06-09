package ua.bykadoroff.hw15;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        Comparator<Box> comparator = new BoxComparator();
        TreeSet<Box> boxSet = new TreeSet<>(comparator);

        boxSet.add(new Box(33.33));
        boxSet.add(new Box(11.33));
        boxSet.add(new Box(9.33));
        boxSet.add(new Box(0.0));
        boxSet.add(new Box(99.33));
        boxSet.add(new Box(66.33));
        boxSet.add(new Box(6.33));

        System.out.println(boxSet);

    }
}

class BoxComparator implements Comparator<Box> {
    @Override
    public int compare(Box o1, Box o2) {
        if (o1.getVolume() == o2.getVolume()) {
            return 0;
        } else if (o1.getVolume() < o2.getVolume()) {
            return -1;
        } else {
            return 1;
        }
    }
}

