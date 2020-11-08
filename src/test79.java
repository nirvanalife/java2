public class test79 {
    //        假设你有一个数组，其中第i 个元素是股票在第i 天的价格。
//你有一次买入和卖出的机会。（只有买入了股票以后才能卖出）。请你设计一个算法来计算可以获得的最大收益。
    public static void main(String []arg){
        int []a=new int[]{4,1,2};
        System.out.println(maxProfit(a));
    }
    /**
     *
     * @param prices int整型一维数组
     * @return int整型
     */
    public static int maxProfit (int[] prices) {
        // write code here
        if(prices.length==0){
            return 0;
        }
        if(prices.length==1){
            return 0;
        }
        int []a=new int[prices.length];
        int []b=new int[prices.length];
        int min=100;
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<=i;j++){
                if(prices[j]<min){
                    min=prices[j];
                }
                a[j]=min;
            }
            min=100;

        }
        for(int i=0;i<prices.length;i++){
            b[i]=prices[i]-a[i];
        }
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        return max;
    }
}
