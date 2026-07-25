//   Check if a number is prime or not
package Loops;
import java.util.*;

public class prime {
    public static void main (String[] args){
        System.out.print("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2 ) {
            System.out.println(n + " is prime");
        } else {
            boolean isPrime = true;         // assume that : number is prime
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0){           // n is a multiple of i (i is not equal to 1 or n)
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }
        sc.close();

        
    }
    
}
