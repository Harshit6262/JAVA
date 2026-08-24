public class subarraySumIII{
    public static void kadane(int numbers []){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            currSum += numbers[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void main (String [] args){
        int numbers []= {-10, -5, -9, -6};
        kadane(numbers);
    }
}

// Time  Complexity → O(n)
// Space Complexity → O(1)