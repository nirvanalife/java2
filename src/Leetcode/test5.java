package Leedcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test5 {
    /**
     * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
     */
    public static void main(String[] args) {
        int a[]={2,1};
        System.out.println(validMountainArray(a));
    }

    public static boolean validMountainArray(int[] A) {
        if(A==null){
            return false;
        }
        if(A.length<3){
            return false;
        }
        int index=0;
       List<Integer> list=Arrays.stream(A).boxed().collect(Collectors.toList());
        int m= Collections.max(list);
        for(int i=0;i<A.length;i++){
            if(A[i]==m){
                index=i;
                break;
            }
        }
        if(index==0){
            return false;
        }
        for(int i=1;i<=index;i++){
            if(A[i]<=A[i-1]){
                return false;
            }
        }
        if(A[index-1]==m){
            return false;
        }
        if(index!=A.length-1&&A[index+1]==m){
            return false;
        }
        if(index==A.length-1){
            return false;
        }
        for(int i=index+1;i<A.length;i++){
            if(A[i]>=A[i-1]){
                return false;
            }
        }

        return true;
    }
}
