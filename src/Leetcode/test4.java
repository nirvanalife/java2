package Leedcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//给定两个数组，编写一个函数来计算它们的交集。
public class test4 {
    public static void main(String[] args) {
        int []num={4,9,5};
        int []num2={9,4,9,8,4};
        int []s=intersection(num,num2);
        int x=0;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums2.length==0){
            return new int[0];
        }

        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> result=new ArrayList<>();
        for(Integer i:list1){
            if(list2.contains(i)){
                if(result.contains(i)){
                    continue;
                }else{
                    result.add(i);
                }
            }
        }
        int size=0;

        if(result.size()==0){
            return new int[0];
        }else{
            size=result.size();
        }
        int []t=new int[size];
        for(int i=0;i<size;i++){
            t[i]=result.get(i);
        }
        return t;
    }
}
