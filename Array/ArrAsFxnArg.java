public class ArrAsFxnArg {
    public static void update(int marks[], int nonChangable){
        nonChangable =10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
            System.out.print(marks[i] + " ");
        }
    }
    public static void main (String[] args){
        int marks [] = {97,98,99};
        int nonChangable =5;
        update(marks, nonChangable);
        System.out.println();
        System.out.println("nonChangable =" + nonChangable);
    }
    
}
