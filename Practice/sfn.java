package Practice;
import java.util.*;

public class sfn {
    public static void main (String [] args){
        System.out.print("Enter n :");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        float sum = 0;

        for(int i =1; i<= n; i ++){
            sum = sum + i;
        }

        System.out.println(sum);
    }
    
}
