package Function;

public class primeRange {
    public static boolean isPrime(int n){
        for(int i =2; i<=Math.sqrt(n); i++){
            
            if(n % 2 == 0){
                return false;
            }
        }
        
        return true;
    }
    public static void Prime_Range(int n){
        System.out.print("All primes in range " + n + " :  " );
        for (int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
            
        }
        System.out.println();
    }
    public static void main (String[] args){
        Prime_Range(20);
    }
    
}
