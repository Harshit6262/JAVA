package Operators;

public class LogicalOperator {
    public static void main (String[] args){
        // Logical Operators
        //   &&  (Logical AND)
        System.out.println((3>2) && (5>0)); //true
        System.out.println((3>2) && (5<0)); //false
        System.out.println((3<2) && (5>0)); //false
        System.out.println((3<2) && (5<0)); //false

        //   ||  (Logical OR)
        System.out.println((3>2) || (5>0)); // true
        System.out.println((3>2) || (5<0)); // true
        System.out.println((3<2) || (5>0)); // true
        System.out.println((3<2) || (5<0)); // false

        //  -->  Vs code marks it as Dead Code
        //       Why this happen?
        //       you used constant values (3,2,5,0), so java can detect result at compile time.
        //       If you want no warning
        //       Use variables instead of fixed constants;
        int x=3, y=2, a=5, b=0;
        //  &&  (Logical AND)
        System.out.println((x>y) && (a>b));  // true
        System.out.println((x>y) && (a<b));  // false
        System.out.println((x<y) && (a>b));  // false
        System.out.println((x<y) && (a<b));  // false

        //  ||  (Logical OR)
        System.out.println((x>y) || (a>b));   // true
        System.out.println((x>y) || (a<b));   // true
        System.out.println((x<y) || (a>b));   // true
        System.out.println((x<y) || (a<b));   // false


        // !  (Logiacal NOT)
        System.out.println(!(3>2));  // false
        System.out.println(!(3<2));  // true
    }
}
