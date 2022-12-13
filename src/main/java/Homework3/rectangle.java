package Homework3;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        System.out.println("The length of the rectangle is:");
        double x = scanner.nextDouble();
        System.out.println("The height of the rectangle is:");
        double y = scanner.nextDouble();
        double  perimeter = 2*(x+y);
        System.out.println("Perimeter of rectangle is: " + perimeter);
        double area = x*y;
        System.out.println("Area of rectangle is:" + area);
    }
}
