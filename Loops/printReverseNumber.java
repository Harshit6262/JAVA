package Loops;

public class printReverseNumber {
    public static void main(String[] args){
        int n = 123456;

        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        System.out.println();
    }
    
}



//   using for loop 

// public class rn {
//     public static void main ( String [] args ){
//         int n = 123456;
//         int rev = 0;
//         for(; n !=0; n= n/10){
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit; 
//         }
//         System.out.println("Reversed Number : " + rev);
//     }
    
// }
