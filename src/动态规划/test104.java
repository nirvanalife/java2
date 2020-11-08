package 动态规划;

public class test104 {
    /**
     * 给定一个double类型的数组arr，其中的元素可正可负可0，返回子数组累乘的最大乘积。例如arr=[-2.5，4，0，3，0.5，8，-1]，子数组[3，0.5，8]累乘可以获得最大的乘积12，所以返回12。
     * 其实不是特别懂
     */
    public static void main(String[] args) {
        double []arr={-2.5,4,0,3,0.5,8,-1};
        System.out.println(maxProduct(arr));
    }
    public static double maxProduct(double[] arr) {
        if(arr.length==0){
            return 0;
        }
        double min=arr[0];
        double max=min;
        double res=max;

        for(int i=1;i<arr.length;i++){
            double t_max=max;
            max=Math.max(Math.max(arr[i],max*arr[i]),min*arr[i]);
            min=Math.min(Math.min(arr[i],min*arr[i]),t_max*arr[i]);
            res=Math.max(res,max);
        }




        return res;
    }
}
