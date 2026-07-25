public class ifElse {
    public static void main(String[] args){
        int age = 16;
        if(age >= 18){
            System.out.println("adult : drive, vote");
        }
        if(age > 13 && age < 18){
            System.out.println("teenager");
        }
        else {
            System.out.println("not adult");
        }

    //   Print the Largest of 2 Numbers   
        int  A = 10;
        int  B = 5;

        if(A >= B){
            System.out.println("A is the Largest Of 2 Numbers");
        } 
        else {
            System.out.println("B is the Largest of 2 Numbers");
        }
    //   Print if Number is Odd or Even?
    
        int x = 10;
        if(x % 2 == 0){
            System.out.println( x + " is even Number");
        }
        else {
            System.out.println(x+"is Odd Number");
        }
    }
    
}
