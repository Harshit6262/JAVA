package P4;
public class p4{
    // Function to print Right-Angled Number Pyramid - II
    public void pattern4(int n){
        // Outer loop to handle rows
        for(int i = 1; i <= n; i++){
            // Inner loop to handle columns for each row
            for(int j = 1; j <=i; j++){
                // Print a number followed by a space
                System.out.print(i + " ");
            }
            // After printing number in a row, move to the next
            System.out.println();
        }

    }
    public static void main(String [] args){
        p4 pattern = new p4();
        int n = 5; // Set the size of the square (5x5)
        pattern.pattern4(n); // Call the function to print the pattern
    }
}