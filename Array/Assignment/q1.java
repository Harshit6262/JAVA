// Question 1 : Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//  Example 1 : 
//      Input : nums = [1, 2, 3, 1]
//     Output : true

//  Example 2 : 
//      Input : nums = [1, 2, 3, 4]
//     Output : false

//  Example 3 : 
//      Input : nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
//     Output : true

//  Constraints :
//         *       1 <= nums.length <= 10^5
//         *       -10^9 <= nums[i] <= 10^9 

//   Approach 1 - Brute Force (O(n^2))

public class q1{
    public static boolean one (int nums []){
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                   return true;
                }
            }
        }
        return false;
    }
    public static void main (String [] args){
        int nums [] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(one(nums));
    }
}
// Time Complexity : O(n^2)
// Space Complexity : O(1)



//  Approach 2 - using Sets (O(n))/* You should have a basic knowledge about Java HashSets before follow ing Approach 2. It w illbetaught to you in later chapters. */  


// public boolean containsDuplicate(int[] nums){
//     HashSet<Integer> set = new HashSet<>(); 
//     for(int i=0; i<nums.length; i++) { 
//         if(set.contains(nums[i])) { 
//             return true; 
//         } else { 
//             set.add(nums[i]); 
//         } 
//     } 
//     return false;
// }