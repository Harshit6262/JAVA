public class hollowRect{
    public static void hollow(int totalRows, int totalCols){
        // Outer loop
        for(int i=1; i<=totalRows; i++){
            // inner loop
            for(int j=1; j<=totalCols; j++){
                if(i==1 || i==totalRows || j==1 || j==totalCols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
    }
    public static void main(String [] args){
        hollow(4,5);
    }
}