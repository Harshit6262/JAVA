import java.util.*;

public class LargestInArr {
    public static int getLargest(int nums []){
        int largest = Integer.MIN_VALUE;  // -Infinity
        for(int i = 0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main (String [] args){
        int nums [] = {1, 2, 6, 3, 5};
        int large = getLargest(nums);
        System.out.println("largest num is : " + large);

    }
}
