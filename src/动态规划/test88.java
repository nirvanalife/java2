import java.util.Arrays;
import java.util.Collections;

public class test88 {
//    给定数组arr，arr中所有的值都为正整数且不重复。每个值代表一种面值的货币，每种面值的货币可以使用任意张，再给定一个aim，代表要找的钱数，求组成aim的最少货币数。
//    如果无解，请返回-1.
    public static void main(String []arg){
        int []arr=new int[]{5,2,3};
        int aim=20;
        System.out.println(minMoney(arr,aim));

    }
    /**
     * 最少货币数
     * @param arr int整型一维数组 the array
     * @param aim int整型 the target
     * @return int整型
     */
    public static int minMoney (int[] arr, int aim) {
        // write code here
        if(aim==0){
            return 0;
        }
        if(arr.length==0){
            return 0;
        }
        Integer []array=new Integer[arr.length];
        for (int i=0;i<arr.length;i++) {
            array[i]=arr[i];
        }
        int min=Collections.min(Arrays.asList(array));
        if(min>aim){
            return -1;
        }
        int []dp=new int[aim+1];
        Arrays.fill(dp,aim+1);
        dp[0]=0;
        
        return 0;
    }
}
