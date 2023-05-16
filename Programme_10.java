package homework;
import java.util.Scanner;
/**
 *  Write a Java program that takes a number as input and prints its
        multiplication table up to 10.
 */
public class Programme_10 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the table number:");
        int n=s.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+ n * i);
        }
    }
}
