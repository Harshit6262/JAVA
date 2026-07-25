//  Q.  Display all numbers entered by user except multiple of 10
package Loops;
import java.util.*;

public class continueStatementQ {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number :");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
            }
            System.out.println("number was " + n);

        } while(true);
       
    }
     
}
