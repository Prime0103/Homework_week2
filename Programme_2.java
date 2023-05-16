package homework;
/**
 * 2.1 Declare two static variable.
 * 2.2 Declare one static method.
 * 2.3 call both static variable into the static method inside the print statment.
 * 2.4 Declare the main method.
 * 2.5 Call the static method into the main method and run the programme.
 */
public class Programme_2 {
    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Programme_2.demo();
    }

    public static void demo() {
     int c = a + b ;
        System.out.println("Enter the first input : " + a);
        System.out.println("enter the first input : " + b);
        System.out.println("addition of two number is : " + c);
    }
}
