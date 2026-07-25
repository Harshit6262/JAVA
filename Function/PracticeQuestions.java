//    Question 1 : Write a Java method to compute the average of three numbers.

// package Function;
// import java.util.*;

// public class PracticeQuestions {
//     public static double avg3Num(double a, double b, double c){
        
//         return (a + b + c) / 3;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input the first number :");
//         double a = sc.nextDouble();
//         System.out.print("Input the second number :");
//         double b = sc.nextDouble();
//         System.out.print("Input the third number:");
//         double c = sc.nextDouble();
//         System.out.print("Average of 3 number : " + avg3Num(a, b, c) + "\n");
//     }

    
// }


//    Question 2  : Write a method named isEven that accepts as int argument. the method should return true if the argument is even, or false otherwise. Also write a program to test your method.

// import java.util.*;

// public static boolean isEven(int n){
//     if(n % 2 == 0){
//         return true;
//     }
//     else {
//         return false;
//     }
    
// }

// public static void main(String [] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number :");
//     int n = sc.nextInt();

//     if(isEven(n)){
//         System.out.println( n + " is even");
//     } else {
//         System.out.println( n + " is odd");
//     }
// }


//    Question 3 : Write a Java program to check if a number is a palindrome in java? (121 is a palindrome, 321 is not)
//    A number is called a palindrome if the number is equal to the reverse of number e.g., 121 is a palindrome because the reverse os 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.




// import java.util.*;

// public static boolean isPalindrome(int n){
//         int palindrome = n;     // copied number into variable
//         int reverse = 0;
        
//         while ( palindrome != 0){
//             int remainder = palindrome % 10;
//             reverse = reverse * 10 + remainder;
//             palindrome = palindrome / 10;
//         }
//         //  if original and the reverse of number is equal means number is palindrome in Java
//         if (n == reverse){
//             return true;
//         }
//         return false;
//     }

// public  static void main(String[] args){
//     System.out.print("Enter Number :");
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
    
//     if(isPalindrome(n)){
//         System.out.println("Number : " + n + " is a palindrome");
//     } else {
//         System.out.println("Number : " + n + " is not a palindrome");
//     }
// }


//     Question  4 :  READ & CODE EXERCISE
//     Search about(Google) & use the following methods of the Math class in Java
//       a. Math.min()       // returns the smaller of two values,
//       b. Math.max()       // returns the larger of two values,
//       c. Math.sqrt()      // Calculate the square root
//       d. Math.pow()       // raises a base to an exponent
//       e. Math.avg()       // does not exist in the standard Java library; you must calculate the average manually using basic arithmetic.
//       f. Math.abs()       // Return the absolute value

//     Free reading resource (https://www.javatpoint.com/java-math)
//     Please feel free to look for more resources/websites on your own.

// public class PracticeQuestions{
//     public static void main(String[] args){
//         //  a. Math.min()    -->  Returns the smaller of two values,
//         int min = Math.min(10, 20);
//         System.out.println(min);   // Returns 10
//         //  b. Math.max()    -->  returns the larger of two values,
//         int max = Math.max(10,20);
//         System.out.println(max);  // Returns 20
//         //  c. Math.sqrt()   -->  Calculate the square root
//         double num = 16.0;
//         double root = Math.sqrt(num);   
//         System.out.println(root);      // Returns 4.0
//         //  d. Math.pow()    --> raises a base to an exponent
//         double base = 5, exponent = 3;
//         double result = Math.pow(base, exponent);  
//         System.out.println(result);   // Returns 125.0
//         //  e. Math.avg  (Custom Implementation)
//         //   Since Math.avg() is not a valid Java method, you must complete the average manually by summing the values and dividing by the count.
//         double a = 4, b = 8;
//         double avg = (a + b) / 2.0; // Returns 6.0
//         System.out.println("Average: " + avg);
//         //   f. Math.abs()    // Returns the absolute value
//         int absVal = Math.abs(-42);
//         System.out.println(absVal);  // 42
//     }
// }

//     Question 5: Write a Java method to compute the sum of the digtis in an integer.
//    (Hint : Approach this question in the following way:
//          a. Take a variable sum = 0
//          b. Find the last digit of the number
//          c. Add it to the sum 
//          d. Repeat a & b until the number becomes 0 )


import java.util.*;
public class PracticeQuestions{

    public static int sumDigit(int n){
        int sum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n /= 10;
        }
        return sum;

    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();

        int add = sumDigit(n);
        System.out.println("Sum  of Digit  " + n + " is :" + add);


    }
}