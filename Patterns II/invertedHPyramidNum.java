public class invertedHPyramidNum {
    public static void invertedNum(int n){
        //  Outer loop
        for(int i=1; i<=n; i++){
            // print number
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        invertedNum(5);
    }
    
}
