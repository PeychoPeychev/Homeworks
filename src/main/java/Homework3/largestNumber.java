package Homework3;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        x = scanner.nextInt();
        System.out.println("Enter the second number:");
        y = scanner.nextInt();
        System.out.println("Enter the third number:");
        z = scanner.nextInt();
        if(x > y && x > z)
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z)
        {
            System.out.println("Largest number is:"+y);
        }
        else
        {
            System.out.println("Largest number is:"+z);
        }

    }
}
