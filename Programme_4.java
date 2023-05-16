package homework;

public class Programme_4 {
    int a = 10, b = 20;
    static int x = 50, y = 100;

    public static void main(String[] args) {
        Programme_4 p3 = new Programme_4();
        p3.m1();
        Programme_4.m2();
    }
    void m1(){
        System.out.println("This is a value for instance variable : " + a);
        System.out.println("this is a variable for instance variable:" + b);
    }
    static void m2(){
        System.out.println("This is a value for instance variable :" + x);
        System.out.println("This is a vvalue for instance variable :" + y);
    }
}
