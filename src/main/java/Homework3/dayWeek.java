package Homework3;

import java.util.Scanner;

public class dayWeek {
    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a day of the week:");
        day = scanner.nextInt();
        if (day == 1) {
            System.out.println("The selected number is 1 the day of the week is monday");
        } else if (day == 2){
            System.out.println("The selected number is 2 the day of the week is tuesday");
        } else if (day == 3){
            System.out.println("The selected number is 3 the day of the week is wednesday");
        } else if (day == 4){
            System.out.println("The selected number is 4 the day of the week is thursday");
        } else if (day == 5){
            System.out.println("The selected number is 5 the day of the week is friday");
        } else if (day == 6){
            System.out.println("The selected number is 6 the day of the week is saturday");
        } else if (day == 7){
            System.out.println("The selected number is 7 the day of the week is sunday");
        } else {
            System.out.println("Incorrect day from week");
        }
    }
}
