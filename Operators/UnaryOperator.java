package Operators;

public class UnaryOperator {
    public static void main(String[] args){

    //   Pre-Increment (1. Value Change, 2. value use)   
    int a = 10;
    int b = ++a;
    System.out.println(a);    // 11
    System.out.println(b);    // 11

    //   Post-Increment (1. Value use, 2. Value change)
    int c = 10;
    int d = c++;
    System.out.println(c);    // 11
    System.out.println(d);    // 10 

    //    Pre-Decrement (1. Value Change, 2. value use)
    int e = 10;
    int f = --e;
    System.out.println(e);      // 9
    System.out.println(f);     //  9

    //   Post-Decrement (1. Value use, 2. Value change)
    int g = 10;
    int h = g--;
    System.out.println(g);       // 9
    System.out.println(h);      // 10
    }
}
