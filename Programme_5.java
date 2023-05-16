package homework;

/**
 * Write a program for a calculator with addition, subtration, multiplicationand, division method all with parameters
 * and use string concatenation method(Note: Two static and two instance method).
 */
public class Programme_5 {
    int a;
    static int b;
    int c;

    public static void main(String[] args) {
        Programme_5 p5 = new Programme_5();
        p5.add(10,20);
        p5.sub(50,30);
        Programme_5.multi(20,20);
        Programme_5.divi(50,5);
    }
    public void add(int a, int b){
        c=a+b;
        System.out.println("Addition of two number is : " + c);
    }
    public void sub (int a, int b){
        c=a-b;
        System.out.println("Substraction of two number: " + c);
    }
    public static void multi(int a, int b) {
        int ans = a * b;
        System.out.println("Multiplication of two number is :" + ans);
    }

    public static void divi(int a, int b) {
        int ans = a/b;
        System.out.println("division of two number is :" + ans);

    }











}
