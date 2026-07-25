package Loops;
import java.util.*;
public class PracticeQuestion {

    //  Q1. : How maany times "Hello" is printed?
    // public static void main(String[] args){
    //     
    //     for(int i=0; i<5; i++){
    //         System.out.println("Hello");   // 2 Times
    //         i+=2;
    //     }
    // }


    //  Q2. : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

 //     public static void main(String[] args){
 //         System.out.println("Enter integers : ");
 //         Scanner sc = new Scanner (System.in);
 //         int n = sc.nextInt();
 //         int sum = 0;
 //         if(n % 2 == 0){
 //             for (int i=0; i<=n; i++){
 //             sum = sum + n;
 //             }
 //             System.out.println("Sum of Even Number :" + sum);
 //         } else {
 //             for (int i=0; i<=n; i++){
 //             sum = sum + n;
 //             }
 //             System.out.println("Sum of Odd Number :" + sum);
 //         }
 //         sc.close();
 //     }


       
    // public static void main (String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     int number;
    //     int choice;
    //     int evenSum = 0;
    //     int oddSum = 0;

    //     do {
    //         System.out.print("Enter the Number :");
    //         number = sc.nextInt();

    //         if(number % 2 == 0){
    //             evenSum += number;
    //         } else {
    //             oddSum += number;
    //         }

    //         System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
    //         choice = sc.nextInt();
    //     } while(choice == 1);

    //     System.out.println("Sum of even numbers : " + evenSum);
    //     System.out.println("Sum of odd number :" + oddSum);
    //     sc.close();
    // }


    //  Q3. Write a program to find the factorial of any number entered by the user.
    //      (Hint : factorial ofa number n = n*(n-1)*(n-2)*(n-3)*......*1 and exists for positive numbers only. We write factorail as n!
    //      So, factorial of 0!=1, 1!=1, 2!=2, 3!=6, 4!=24 and so on.
    //      Note- Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)


    // public static void main(String[] args){
    //     System.out.print("Enter any positive integer n :");
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     int factorial = 1;

    //     for(int i=1; i<=n; i++){
    //         factorial *= i;
    //     }
    //     System.out.println("Factorial: "+ factorial );
    //     sc.close();
    // }


    //  Q4. : Write a program to print the multiplication table of a number N, entered by the user.

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Number :");
    //     int n = sc.nextInt();

    //     for(int i=1; i<=10; i++){
    //         System.out.println(n + " * " + i + " = " + n*i);
    //     }
    //     sc.close();
    // }


    //  Q5. What is wrong in the following program?
    //     public class Solution{
    //        public static void main(String args []){
    //            for(int i=0; i<=5; i++){
    //                System.out.println("i = " + i);
    //            }
    //            System.out.println("i after the loop = " + i);
    //        }
    //     }

    public static void main(String[] args){
        for(int i=0; i<=5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);
    }

    //   Solution : Scope of variable is referred to the part of the program where the variable can be used.
    //    In this program variable i is declared in the for loop. So scope of variable i is limited to the for
    //    loop only that is between { and } of the for loop. There is a display statement after the for loop 
    //    where variable i is used which means i is used out of scope. This leads to compilation errors.
    //    The program given will not run and give an error instead. To correct the program, the variable i needs 
    //    to be declared outside the for loop.

}