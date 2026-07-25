public class butterfly {
    public static void pattern(int n){
        // 1st Half
        // Outer loop - line track
        for(int i=1; i<=n; i++){ 
            // Star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Space - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        // Outer loop - line track
        for(int i=n; i>=1; i--){
            // Star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Space - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String [] args){
        pattern(4);
    }
    
}
