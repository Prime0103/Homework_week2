package homework;
/*1.1 Declare two instance variable.
1.2 Declare one instance variable.
1.3 Call both instance variable into the instance method inside
1.4 Declare the main method.
1.5 Call the above instance method into the main method and run
 */
public class Programme_1 {

    int a = 10;
    String name = "Testing";

    public static void main(String[] args) {
        Programme_1 p1 = new Programme_1();

    }
    public void m1(){
        System.out.println(a);
        System.out.println("String =" + name);

    }
}
