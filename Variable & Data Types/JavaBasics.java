import java.util.*;

public class JavaBasics {
    public static void main(String args[]){
        // System.out.print("Hello World!");         (print karne ke liye ye line hai)
        System.out.println("Hello World!");  //   (println --> next line ke liye use hota)
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        // print a pattern
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        //Variable in Java 
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        String name = "Tony Stark";
        System.out.println(name);
        a = 50;
        System.out.println(a);
        

        // Data Types in Java
        byte bt = 8;
        System.out.println(bt);
        char ch = 'a';
        System.out.println(ch);
        boolean var = false;       // iski value true bhi ho skti
        System.out.println(var);
        float price = 10.5f;       // float data type me hmesha literal ke end me f lagayenge
        System.out.println(price);
        int number = 25;
        System.out.println(number);
        double d = 10.5;
        System.out.println(d);
        long l = 1000;
        System.out.println(l);

        // Sum of a & b
        int x = 10;
        int y = 5;
        int sum = x+y;
        System.out.println(sum);

        // Input in Java
        Scanner sc = new Scanner(System.in);
        /* String input = sc.next();         // (ye sirf single word ko input leta hai space tak)
           System.out.println(input);
        */
        
        // String FullName = sc.nextLine();     // (ye pura statement ko input leta hai)
        // System.out.println(FullName);

        int num = sc.nextInt();                // (General -purpose Integer type, most commonly used for numeric calculations.)
        System.out.println(num);

        byte bite = sc.nextByte();            //  (Useful for saving memory in large arrays, especially when value are small ( like file handling, raw data streams))
        System.out.println(bite);

        float cost = sc.nextFloat();          //  (Use flaot when memory is tight and precision requirements are modest (something limited))
        System.out.println(cost);

        double decimal = sc.nextDouble();     //  (Use double when precision matters (scientific, financial or engineering calculation))
        System.out.println(decimal);

        boolean bl = sc.nextBoolean();        // (boolean is used to represent true/false value. it controls logic and decision-making in programs)
        System.out.println(bl);

        short st = sc.nextShort();            // (In Java, both SHORT and LONG are primitive data type used to store integers, but they differ in size, range and memory usage)
        System.out.println(st);

        long lg = sc.nextLong();
        System.out.println(lg);

        // Sum of a & b
        int c = sc.nextInt();
        int e = sc.nextInt();
        int add = c + e;
        System.out.println(add);

        // Product of a & b

        int f = sc.nextInt();
        int g = sc.nextInt();
        int product = f*g;
        System.out.println(product);
        sc.close();
    }
}
