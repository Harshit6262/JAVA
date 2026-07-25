//   Q.  Keep entering numbers till user enters a multiple of 10
package Loops;
import java.util.*;

public class breakKeywordQ {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter number :");
            n = sc.nextInt();
            
            if( n % 10 == 0 ){
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println(n +" is multiple of 10");
        sc.close();
    }
    
}
