package 动态规划;

import java.util.ArrayList;
import java.util.Collections;

//假定你知道某只股票每一天价格的变动。
//你最多可以同时持有一只股票。但你可以无限次的交易（买进和卖出均无手续费）。
//请设计一个函数，计算你所能获得的最大收益。
public class test93 {
    public static void main(String[] args) {
        int []prices=new int[]{2,4,10,57,30,82,90,12,5,13};
        System.out.println(maxProfit(prices));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算最大收益
     * @param prices int整型一维数组 股票每一天的价格
     * @return int整型
     * 把递增的数组段分开，每一段最小最大求差，之后求和
     *
     */
    public static int maxProfit (int[] prices) {
        // write code here
        if(prices.length==0){
            return 0;
        }

        int flag=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[i-1]){
                list.add(prices[i-1]-prices[flag]);
                flag=i;
            }
            if(i==prices.length-1){
                list.add(prices[i]-prices[flag]);
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        return sum;
    }
}
