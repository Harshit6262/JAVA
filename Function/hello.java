package Function;
import java.util.*;

public class hello {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    // Syntax With Parameters void type
    // public static void calculateSum(int num1, int num2){
    //     int sum = num1 + num2;
    //     System.out.println("Sum is : " + sum);
    // }

    // Syntax with Parameters return type
    public static int calculateSum(int num1, int num2){   //parameters or formal parameter
        int sum = num1 + num2;
        return sum;
    }

    public static void main (String[] args){
        printHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);          // arguments or actual parameters
        System.out.println("Sum is :" + sum);
        sc.close();
    }
    
}
