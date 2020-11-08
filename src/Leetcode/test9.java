package Leetcode;
/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class test9 {
    public static void main(String[] args) {
        int []x={7,6,4,3,1};
        
        System.out.println(maxProfit(x));
    }

    public static int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for(int i=1;i<prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][1], dp[i-1][0]-prices[i]);
        }

        return dp[prices.length-1][0];
    }
    
}
