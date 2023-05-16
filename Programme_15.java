package homework;
import java.util.Scanner;
/**
 * Write a Java program to swap two variables.
 */

public class Programme_15 {
    public static void main(String[] args)
    {
        int x ,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Befor the swapped values of x and y: ");
        x= sc.nextInt();
        y=sc.nextInt();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = x ^ y ^ (y = x);        //Bitwise operator
        System.out.println("After the swapped values of x and y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
