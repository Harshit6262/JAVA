// package Function;

// public class prime {
//     public static boolean isPrime(int n){
//         boolean isPrime = true;
//         for(int i = 2; i <=n-1; i++){
//             if(n % i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }
//     public static void main (String [] args){
//         System.out.println(isPrime(5));
//     }
// }

// package Function;

// public class prime{
//     // only for n>=2
//     public static boolean isPrime(int n){
//         //corner cases
//         //2 
//         if(n == 2){
//             return true;
//         }
//         for(int i = 2; i<=n-1; i++){
//             if(n % i == 0){ //completely dividing
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main (String[] args){
//         System.out.println(isPrime(2));

//     }
// }


//  Optimized Method
package Function;

public class prime{
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        System.out.println(isPrime(3));
    }
}