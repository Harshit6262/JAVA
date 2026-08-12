public class p2 {
    // Function to print a Right-Angled Triangle Pattern
    public void pattern2(int n){
        // Outer loop to handle rows
        for(int i = 0; i<n; i++){
            // Inner loop to handle columns for each row
            for(int j = 0; j<=i; j++){
                // Print a star followed by a space
                System.out.print("* ");
            }
            // After printing stars in a row, move to the next 
            System.out.println();
        }

    }
    public static void main (String []  args){
        p2 pattern = new p2();
        int n = 5; // Set the size of the pattern
        pattern.pattern2(n); // Call the function to print the pattern
    }
}