package Function;

public class Swap {
    public static void swap (int a, int b){
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b  = " + b);

    }
    public static void main(String[] args){
        // //swap  -  values exchange
        // int a = 5;
        // int b = 10;

        // // Swap 
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);


        int a = 5;
        int b = 10;
        swap(a, b);   // (java me mostly call by value use hota hai iska maatlab jo hm main function me swap function ko call kar rhe argument se mtalb jo argument pass kar kr hai wo swap function me parameter me copy bn rhi hai aur wo chnge sirf swap function me hi hoga  )
    }
    
}
