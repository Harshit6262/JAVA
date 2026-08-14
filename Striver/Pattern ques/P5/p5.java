public class p5 {
    // Function to print Inverted Right Pyramid
    public void pattern5(int n){
        // Outer loop to handle rows
        for (int i = 0; i < n; i++){
            // Inner loop to handle columns for each row
            for(int j = n; j > i; j--){
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next 
            System.out.println();
        }
    }
    public static void main (String [] args){
        // Create object of p5 class
        p5 pattern = new p5();
        int n = 5; // Set the size of the pattern
        pattern.pattern5(n); // Call the function to print the pattern
    }
}