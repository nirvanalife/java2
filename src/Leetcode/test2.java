package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 *
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 */
public class test2 {
    public static void main(String[] args) {
        int []arr={1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }


        for (Integer i:map.keySet()) {
            for(Integer j:map.keySet()){
                if(i.equals(j)){
                    continue;
                }else{
                    if(map.get(i).equals(map.get(j))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
