public class p7 {
    // Function to print Star Pyramid
    public void pattern7(int n){
        // Outer loop to handle rows
        for(int i = 0; i < n; i++){
            // Inner loop to handle columns for each row
            // Print leading spaces
            for(int j = 1; j <= n-i-1; j++){
                System.out.print(" ");
            }
            // Print stars
            for(int j = 1; j <= 2*i+1; j++){
                System.out.print("*");
            }
            // Print trailing spaces
            for(int j = 1; j <= n-i-1; j++){
                System.out.print(" ");
            }
            // Move to next row
            System.out.println();
        }
    }
    public static void main (String [] args ){
        // Create object of p7 class
        p7 pattern = new p7();
        int n = 5; // Set the size of the pattern
        pattern.pattern7(n); // Call the function to print the pattern
    }
}