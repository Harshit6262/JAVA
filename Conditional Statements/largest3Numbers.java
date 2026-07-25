public class largest3Numbers {
    public static void main(String[] args){
        int A = 1, B = 3, C = 6;
        if (A >= B && A >= C){
            System.out.println("A is the Largest Number");
        }
        else if (B >= C){
            System.out.println("B is the largest Number");
        }
        else {
            System.out.println("C is the Largest number");
        }
    }
}
