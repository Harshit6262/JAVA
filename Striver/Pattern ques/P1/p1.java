public class p1 {
    // Function to print a square pattern of stars
    public void pattern1(int n){
        // Outer loop to handle rows
        for(int i = 0; i < n; i++){
            // Inner loop to handle columns for each row
            for(int j = 0; j < n; j++){
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next 
            System.out.println();
        }
    }
    public static void main(String [] args){
         p1 pattern = new p1();
        int n = 5; // Set the size of the square (5x5)
        pattern.pattern1(n); // Call the function to print the pattern
    }
}
