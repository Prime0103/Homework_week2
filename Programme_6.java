package homework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of area A=PI*r*r) import
 * java.util.Scanner;
 */

public class Programme_6 {
    public static void main(String[] args) {
        double area,radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any radius value of the circle :");
        radius = sc.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("The expected result of circle is :" + area);

    }
}
