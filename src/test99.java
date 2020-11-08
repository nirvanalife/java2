import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test99 {
//    山峰元素是指其值大于或等于左右相邻值的元素。给定一个输入数组nums，任意两个相邻元素值不相等，数组可能包含多个山峰。找到索引最大的那个山峰元素并返回其索引。
//
//    假设 nums[-1] = nums[n] = -∞。
    public static void main(String[] args) {
        int []a={2,51,12,95,42,52,76,77,23,81,71,41,2,23,43,4,64,22,71,96,1,87,51,91,67,16,58,11,44,38,63,14,4,69,88,49,92,91,9,15,17,74,21,91,24,78,62,50,82,26,53,18,25,14,94,79,44,11,36,38,44,53,9,34,58,6,50,82,81,50,36,1,6,61,9,47,33,47,84,41,57,48,73,18};
        System.out.println(solve(a));
    }
    /**
     * 寻找最后的山峰
     * @param a int整型一维数组
     * @return int整型
     */
    public static int solve (int[] a) {
        // write code here
        if(a.length==0){
            return 0;
        }
        for(int i=a.length-1;i>=1;i--){
            if(a[i]>=a[i-1]){
                return i;
            }
        }

        return 0;
    }
}
