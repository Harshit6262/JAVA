package Loops;
import java.util.*;

public class SumFirstNnatural {
    public static void main(String[] args){
        System.out.print("Enter number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        float sum = 0;

        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
