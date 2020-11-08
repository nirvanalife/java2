package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test1 {
    /**
     * 一群孩子做游戏，现在请你根据游戏得分来发糖果，要求如下：
     * 1. 每个孩子不管得分多少，起码分到一个糖果。
     * 2. 任意两个相邻的孩子之间，得分较多的孩子必须拿多一些糖果。(若相同则无此限制)
     * 给定一个数组arr代表得分数组，请返回最少需要多少糖果。
     * [要求]
     * 时间复杂度为On, 空间复杂度为O1
     */
    public static void main(String[] args) {
        int []arr={1,1,2};
        System.out.println(candy(arr));
    }
    /**
     * pick candy
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public static int candy (int[] arr) {
        // write code here
        int []b=arr.clone();
        Map<Integer,Integer> map=new HashMap<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(map.keySet().contains(arr[i])){

                map.put(arr[i],map.get(arr[i])+1);
            }else{
               map.put(arr[i],1);
            }
        }
        int l=map.size();
        int []count=new int[l];
        int k=0;
        for(Integer i:map.keySet()){
            count[k++]=map.get(i);

        }
        int sum=0;
        for(int i=0;i<l;i++){
            sum=sum+(i+1)*count[i];
        }
        return sum;
    }
}
