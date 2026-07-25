package Function;

public class OverloadingDataTypes {
    // Function to calculate int sum 
    public static int sum (int a, int b){
        return a + b;
    }

    // Function to calculate float sum
    public static float sum (float a, float b){
        return a + b;
    }
    public static void main (String [] args){
        System.out.println(sum (3,5));
        System.out.println(sum(4.2f, 3.8f));

    }
    
}
