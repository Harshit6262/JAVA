import java.util.*;
public class LargestNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A % 2 == 0){
            System.out.println(A + " is Largest Number");
        }
        else {
            System.out.println(B + " is Largest Number");
        }
        sc.close();

        // //   Print the Largest of 2 Numbers   
        // int  A = 10;
        // int  B = 5;

        // if(A >= B){
        //     System.out.println("A is the Largest Of 2 Numbers");
        // } 
        // else {
        //     System.out.println("B is the Largest of 2 Numbers");
        // }
    }
}
