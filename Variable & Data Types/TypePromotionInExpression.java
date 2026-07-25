public class TypePromotionInExpression {
    public static void main(String args []){
        // 1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
        char a = 'a';
        char b = 'b';
       // char c = a - b;              (cannot convert from int to char) 
        System.out.println((int)(a));     // 97
        System.out.println((int)(b));    //  98
        System.out.println(a+b);        //   195
        System.out.println(b-a);       //    1
        System.out.println(a);         // "a" (type conversion sirf expression me hota hai)
        short d = 5;
        byte e = 25;
        char c = 'c';
        // byte bt = a +b +c;         (cannot convert from int to byte)
        byte bt = (byte) (d + e+ c);   // typecast karke integer value ko byte me convert kar diya
        System.out.println(bt);        // -127

        // 2. If one operand (variable name like a, b, c) is long, float, or double the whole expression is promoted to long, float, or double respectively. 

        int i = 10;
        float f = 20.25f;
        long l = 25;
        double dl = 30;
        double ans = i + f+ l+ dl;     // (yaha pe int, float , long sbko double me typePromotion  kiya fir add hua)
        System.out.println(ans);      // 85.25

        byte by = 5;                   // range (-128 to +127)-
        // byte byt =  b * 2;          // Type mismatch : cannot convert from int to byte
        byte byt = (byte) (by *2);
        System.out.println(byt);

    }
}
