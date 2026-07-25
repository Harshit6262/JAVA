package Function;

public class factorial {
    public static int fact( int n){
        int f = 1;
        for(int i =1; i<=n; i++){
            f = f * i; 
        }
        return f;    // factorial of n
    }
    public static void main (String [] args){
        int n=4;
        System.out.println("Factorial of " +  n  + " is :" + fact(4)); 
    }
    
}
