package huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 给出一组候选数\ C C 和一个目标数\ T T，找出候选数中起来和等于\ T T 的所有组合。
 * \ C C 中的每个数字在一个组合中只能使用一次。
 */
public class test2 {
    public static void main(String[] args) {
        int []num={1};
        ArrayList<ArrayList<Integer>> list=combinationSum2(num,2);
        int x=0;

    }
    public static ArrayList<ArrayList<Integer>> l=new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {

        if(num==null){
            return null;
        }
        if(num.length==0){
            return null;
        }
        if(num.length==1){
            if(num[0]==target){
                ArrayList<Integer> ll=new ArrayList<>();
                ll.add(num[0]);
                l.add(ll);
                return l;
            }else{
                return l;
            }
        }
        Arrays.sort(num);
//        int flag=0;
//        if(num[0]==target){
//            ArrayList<Integer> ll=new ArrayList<>(num[0]);
//            l.add(ll);
//            return l;
//        }
//        if(num[0]>target){
//            return l;
//        }
//        for(int i=1;i<num.length;i++){
//            if(num[i]>target&&num[i-1]<=target){
//                flag=i;
//                break;
//            }
//        }
//
//        int []nn=new int[flag];
//        for(int i=0;i<flag;i++){
//            nn[i]=num[i];
//        }
        boolean []x=new boolean[num.length];
        helper(num,target,new ArrayList<>(),x,0);
        for(ArrayList<Integer> li:l){
            Collections.sort(li);
        }
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for(ArrayList<Integer> li:l){
            if(!result.contains(li)){
                result.add(li);
            }
        }

        return result;
    }
    public static void helper(int []n,int target,ArrayList<Integer> list,boolean []visited,int sum){
//        int sum=0;
//        for (int x:list){
//            sum=sum+x;
//        }
        if(sum==target){
            l.add(new ArrayList<>(list));
            return;
        }
        int pre=n[0]-1;
        for(int i=0;i<n.length;i++){
            if(!visited[i]&&pre!=n[i]){

                if(target-sum>=n[i]){
                    list.add(n[i]);
                    sum=sum+n[i];
                    visited[i]=true;
                    pre=n[i];
                    helper(n,target,list,visited,sum);
                    sum=sum-list.get(list.size()-1);
                    list.remove(list.size()-1);

                    visited[i]=false;
                }else{

                    return;
                }


            }
        }


    }
}
