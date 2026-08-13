public class p3 {
    // Function to print a Right-Angled Number Pyramid Pattern
    public void pattern3(int n){
        // Outer loop to handle rows
        for(int i = 1; i <= n; i++){
            // Inner loop to handle columns for each row
            for(int j = 1; j <= i; j++){
                // Print a number followed by a space
                System.out.print(j + " ");
            }
            // After printing number in a row, move to the next 
            System.out.println();
        }
    }
    public static void main(String [] args){
        // Create object of p3 class
        p3 pattern = new p3();
        int n = 5; // Set the size of the pattern
        pattern.pattern3(n); // Call the function to print the pattern
    }
}