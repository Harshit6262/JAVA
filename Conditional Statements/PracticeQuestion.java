import java.util.*;
public class PracticeQuestion {
    // Question 1 : Write a java program to get a number from the user and print whether it is positive or negative.
    // public static void main(String[] args){
    //     System.out.println("Enter A Number :");
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();
    //     if(number >= 0){
    //         System.out.println(number + " is Positive number.");
    //     }
    //     else {
    //         System.out.println(number + " is Negative number.");
    //     }
    //     sc.close();
    // }

    //  Question 2 : Finish the following code so that it prints YOu have a fever if your temperature is above 100 and otherwise prints You don't hava a fever.
    //   public class Solution{
    //      public static void main(String[] args){
    //          double temp = 103.5;
    //      }
    //   }
    // public static void main(String[] args){
    //     double temp = 93.5;
    //     if(temp > 100){
    //         System.out.println("You have a Fever.");
    //     }
    //     else {
    //         System.out.println("You don't have a fever.");
    //     }
    // }
    

    //   Question 3 : Write a Java Program to input week number (1-7) and print day of the week name using switch case.
    // public static void main(String[] args){
    //     System.out.println("Enter a Number between 1 to 7 :");
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();
    //     switch (number){
    //         case 1 : System.out.println("Monday");
    //                     break;
    //         case 2 : System.out.println("Tuesday");
    //                     break;
    //         case 3 : System.out.println("Wednesday");
    //                     break;
    //         case 4 : System.out.println("Thursday");
    //                     break;
    //         case 5 : System.out.println("Friday");
    //                     break;
    //         case 6 : System.out.println("Saturday");
    //                     break;
    //         case 7 : System.out.println("Sunday");
    //                     break;
    //         default : System.out.println("Not a valid input or Day");                                                                                    
    //     }
    // }


    //   Question 4: What will be the value of x & y in the following program.
    
    //   public class Solution{
    //       public static void main (string[] args){
    //           int a = 63, b = 36;
    //           boolean x = (a > b) ? true : false;
    //           int y = (a > b) ? a : b;
    //       }
    //   }

    // public static void main(String[] args){
    //     int a = 63, b = 36;
    //     boolean x = (a < b) ? true : false;
    //     int y = (a > b) ? a : b;
    //     System.out.println(x);   // false
    //     System.out.println(y);   //  63
    // }

    //  Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not.
      
        public static void main (String[] args){
            System.out.println("Enter year :");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();

            boolean x = (year % 4 ) == 0;
            boolean y = (year % 100) != 0;
            boolean z = ((year % 100 == 0) && (year % 400 ==0));

            if(x && (y || z)) {
                System.out.println(year + " is a leap year");
            }
            else {
                System.out.println(year + " is not a leap year");
            }
            sc.close();
        }
}
