package 动态规划;

import java.util.Arrays;
import java.util.Collections;

public class test88 {
//    给定数组arr，arr中所有的值都为正整数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，再给定一个aim，代表要找的钱数，求组成aim的最少货币数。
//    如果无解，请返回-1.
    public static void main(String []arg){
        int []arr=new int[]{5,2,3};
        int aim=6;
        System.out.println(minMoney(arr,aim));

    }
    /**
     * 最少货币数
     * @param arr int整型一维数组 the array
     * @param aim int整型 the target
     * @return int整型
     * 先把每个用的个数都默认为aim+1个，因为面值最小是1，最多只是aim个，所以aim+1是不可达上限，从1元开始计算最少需要多少张钱币，凑不成就留下aim+1，凑成就找最小张数，最后返回要是aim+1证明无解
     */
    public static int minMoney (int[] arr, int aim) {
        // write code here
        int []dp=new int[aim+1];
        Arrays.fill(dp,aim+1);
        dp[0]=0;
        for(int i=1;i<aim+1;i++){
            for(int j=0;j<arr.length;j++){
                if(i-arr[j]>=0){
                    dp[i]=Math.min(dp[i],dp[i-arr[j]]+1);
                }
            }
        }

        return dp[aim]==aim+1?-1:dp[aim];
    }
}
