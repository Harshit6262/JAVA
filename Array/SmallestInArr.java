import java.util.*;

public class SmallestInArr {
    public static int getSmallest(int nums []){
    int small = Integer.MAX_VALUE;  // +Infinity
    for(int i = 0; i<nums.length; i ++){
        if(nums [i] < small){
            small = nums[i];
        }
    }
    return small;
    }
    public static void main (String [] args){
        int nums [] = {1, 2, 6, 3, 5};
        System.out.println("Smallest num is : " + getSmallest(nums));
    } 
    //   Time Complexity : O(n)
}

