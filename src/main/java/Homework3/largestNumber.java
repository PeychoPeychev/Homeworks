package Homework3;

import java.util.Scanner;

 public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstnumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number: ");
        int secondnumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the third number: ");
        int thirdnumber = Integer.parseInt(scanner.nextLine());
        if (firstnumber>secondnumber && firstnumber>thirdnumber){
            System.out.println(firstnumber + " is the largest number" );}
        else if (secondnumber>firstnumber && secondnumber>thirdnumber) {
            System.out.println(secondnumber + " is the largest number");}
        else
            System.out.println(thirdnumber + "" + " is the largest number");
    }
}

