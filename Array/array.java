import java.util.*;
public class array{
    public static void main (String [] args){
        int marks [] = new int[100];
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks :");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry marks :");
        marks[1] = sc.nextInt();
        System.out.print("Enter Math Marks :");
        marks[2] = sc.nextInt();

        System.out.println("Phy marks =" + marks[0]);
        System.out.println("Chem Marks =" + marks[1]);
        System.out.println("Math marks =" + marks[2]);

        // Updated marks
        marks[2] = 100;
        System.out.println("Updated Math marks =" + marks[2]);
        marks[1] = marks[1] + 2;
        System.out.println("Updated chem marks =" + marks[1]);

        // percentage
        float percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percenatage =" + percentage + "%");

        System.out.println("Array of length =" + marks.length);
    }
}