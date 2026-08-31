// 121. Best Time to Buy And Sell Stock

//  Questiion 3 : You are given an array prices where prices[i] is the price of the given stock on yhe ith  day.
//  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit return 0.

//  Example 1 : 
//      Input : price = [7, 1, 5, 3, 6, 4]
//     Output : 5
//     Explanation : Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

//  Example 2 : 
//      Input : prices = [7, 6, 4, 3, 1]
//     Output : 0
//     Explanation : In this case, no transactions are done and max profit = 0

//  Constraints :
//         *       1 <= prices.length <= 10^5
//         *       0 <= nuprices[i] <= 10^4

public class q3{
    public static int stock(int prices []){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main (String [] args){
        int prices [] = {7, 6, 4, 3, 1};
        System.out.println(stock(prices));
    }
}

//   We traverse the array once, so the time complexity is O(n), and we use only constant extra space, so the space complexity is O(1)