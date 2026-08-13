public class p6{
    // Function to print Inverted Numbered Right Pyramid
    public void pattern6(int n){
        // Outer loop to handle rows
        for(int i = 0; i < n; i++){
            // Inner loop to handle columns for each row
            for (int j = n; j > i; j--){
                // Prints numbers from 1 up to (N - i)
                System.out.print(n - j + 1 + " ");
            }
            // Move to next line
            System.out.println();
        }
    }
    public static void main(String [] args){
        // Create object of p6 class
         p6 pattern = new p6();
        int n = 5; // Set the size of the square (5x5)
        pattern.pattern6(n); // Call the function to print the pattern
    }
}