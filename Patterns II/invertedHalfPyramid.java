public class invertedHalfPyramid {
    public static void inverted(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Star
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main (String [] args){
        inverted(5);
    }
    
}
