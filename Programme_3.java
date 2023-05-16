package homework;
/**
 * 3.1 Declare one instance and static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variable into both instance and static the print method inside the print statment.
 * 3.5 Declare the main method.
 * 3.6 Call both instance and static metod inot the main method and run the programme
 */
public class Programme_3 {
    public static void main(String[] args) {
        Programme_3 p3 = new Programme_3();
        p3.m1();
        Programme_3.m2();
    }
    public void m1(){
        System.out.println("value of instance variable : ");
    }
    public static void m2(){
        System.out.println("value for static variable : ");
    }

}
