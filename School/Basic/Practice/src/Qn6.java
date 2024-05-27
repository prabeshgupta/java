//Write a Java program to display the current date time in specific format. 

import java.time.LocalDate;
import java.time.LocalTime;

public class Qn6 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        LocalTime time = LocalTime.now();

        System.out.println("Current date: " + date + " and Current time:" + time);

    }
}
