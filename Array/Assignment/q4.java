//  42. Trapping rain water
//  Question 4 : Given n non-negative integers representing an elevation map where the width of each bar is 1, Compute how much water it can trap after raining.

//  Example 1 : 
//      Input : height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
//      Output : 6
//      Explanation : The above elevation map (black section) is represented by array [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]. In this case, 6 units of rain water (blue section) are being trapped.

//  Example 2 : 
//      Input : height = [4, 2, 0, 3, 2, 5]
//     Output : 9

//  Constraints :
//         *       n == height,length
//         *       1 <= n <= 2 * 10^4
//         *       0 <= height[i] <= 10^5


public class q4 {
    public static int trapWater(int [] height){
        int n = height.length;
        int leftMost [] = new int [n];
        leftMost [0] = height [0];
        for(int i = 1; i<n; i++){
            leftMost [i] = Math.max(leftMost[i-1], height[i]);
        }
        int rightMost [] = new int [n];
        rightMost[n-1] = height [n-1];
        for(int i = n-2; i >= 0; i--){
            rightMost [i] = Math.max(rightMost[i+1], height[i]);
        }
        int trapedwater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMost[i], rightMost[i]);
            trapedwater += waterLevel - height[i];
        }
        return trapedwater;
    }
    public static void main (String [] args){
        int height [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trapWater(height));
    }
}

//   prefix/suffix array approach

//  The time complexity is O(n) because we traverse the array a constant number of times. The space complexity is O(n) because we use two additional arrays, leftMax and rightMax, each of size n.

//  Time Complexity  : O(n)
//  Space Complexity : O(n)


//   Can you optimize the space?

//  Yes, we can use the two-pointer approach to reduce the extra space from O(n) to O(1), while keeping the time complexity O(n).

//   Time  → O(n)
//   Space → O(1)


// class Solution {
//     public int trap(int[] height) {

//         int left = 0;
//         int right = height.length - 1;

//         int leftMax = 0;
//         int rightMax = 0;

//         int water = 0;

//         while (left < right) {

//             if (height[left] <= height[right]) {

//                 if (height[left] >= leftMax) {
//                     leftMax = height[left];
//                 } else {
//                     water += leftMax - height[left];
//                 }

//                 left++;

//             } else {

//                 if (height[right] >= rightMax) {
//                     rightMax = height[right];
//                 } else {
//                     water += rightMax - height[right];
//                 }

//                 right--;
//             }
//         }

//         return water;
//     }
// } 