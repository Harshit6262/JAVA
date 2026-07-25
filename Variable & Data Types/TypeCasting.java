import java.util.*;
public class TypeCasting {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        float marks = 99.999f;
        int marks2 = (int) marks;
        System.out.println(marks2);   //99
        sc.close();

        //character convert into number
        char ch = 'a';
        char ch1 = 'b';
        char ch2 = 'A';
        int number = ch;
        int number1 = ch1;
        int number2 = ch2;
        System.out.println(number);   //97
        System.out.println(number1);  //98
        System.out.println(number2);  //65 
    }
    
}
