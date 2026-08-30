//  Search In Rotated Sorted Array

//  Question 2 : There is an integer array nums sorted in ascending order (with distinct values). prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], numa[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0, 1, 2, 4, 5, 6, 7] might be rotated at pivot index 3 and become [4, 5, 6, 7, 0, 1, 2].
//  Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
//  You must write an algorithm with O(log n) runtime complexity.

//  Example 1 : 
//      Input : nums = [4, 5, 6, 7, 0, 1, 2], target = 0
//     Output : 4

//  Example 2 : 
//      Input : nums = [4, 5, 6, 7, 0, 1, 2], target = 3
//     Output : -1

//  Example 3 : 
//      Input : nums = [1], target = 0
//     Output : -1

//  Constraints :
//          *      1 <= nums.length <= 5000
//          *      -10^4 <= nums[i] <= 10^4
//          *      All values of nums are unique.
//          *      nums is an ascending array that is possibly rotated.
//          *      -10^4 <= target <= 10^4


public class q2 {
    public static int index(int nums [], int target){
        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            int mid = start + (end - start);
            if(nums[mid] == target){
                return mid;
            }
            // Check left half sorted
            if(nums[start] <= nums[mid]){
                // Check Target is in the left sorted range.
                if(nums[start] <= target && target < nums[mid]){
                    end = mid - 1;
                } 
                else {
                    start = mid + 1;
                }   
            }
            // Check right half sorted
            else {
                // Check Target is in the right sorted range.
                if (nums [mid] < target && target <= nums[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main (String [] args){
        int nums [] = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        System.out.println(index(nums, target));
    }
}

The time complexity is O(log n) because we eliminate half of the search space in every iteration, and the space complexity is O(1) because we use only constant extra space