package Practice;

public class rn {
    public static void main ( String [] args ){
        int n = 123456;
        int rev = 0;
        for(; n !=0; n= n/10){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit; 
        }
        System.out.println("Reversed Number : " + rev);
    }
    
}
