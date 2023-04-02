package ua.bykadoroff.hw1;
import java.time.LocalDate;
import java.time.LocalTime;

public class Task1 {

    public static void main (String[] args){
        var currentDate = LocalDate.now();
        var currentTime = LocalTime.now();
        System.out.println("Ruslan Bykadorov");
        System.out.println(currentDate);
        System.out.println(currentTime);
    }
}
