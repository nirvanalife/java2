package fenzhi;

import java.util.ArrayList;
import java.util.Arrays;

public class test1 {
    /*
    有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
    给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
     */
    public static void main(String[] args) {
        int []a={1,3,5,2,2};
        System.out.println(findKth(a,5,3));
    }
    public static int findKth(int[] a, int n, int K) {
        // write code here
        ArrayList<Integer> list=new ArrayList<>();
        int []b=a.clone();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(list.contains(a[i])){
               continue;
            }else{
                list.add(a[i]);
            }
        }
        int x=list.size();

        int m=list.get(x-K);

        return m;
    }

}
