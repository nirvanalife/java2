package huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *给出一组可能包含重复项的数字，返回该组数字的所有排列。
 */
public class test1 {
    public static void main(String[] args) {
        int []num={1,1,2};
        ArrayList<ArrayList<Integer>> l=permuteUnique(num);
        int x=0;
    }

    public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(num==null){
            return res;
        }
        if(num.length==0){
            return res;
        }
        boolean []visited=new boolean[num.length];
        Arrays.sort(num);
        per(num,visited,new ArrayList<>(),res);
       return res;
    }
    public static void per(int []num,boolean []visited, ArrayList<Integer> cur,ArrayList<ArrayList<Integer>> res){
        if(cur.size()==num.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        int pre=num[0]-1;
        for(int i=0;i<num.length;i++){
            if(!visited[i]&&pre!=num[i]){
                pre=num[i];
                visited[i]=true;
                cur.add(num[i]);
                per(num,visited,cur,res);
                cur.remove(cur.size()-1);
                visited[i]=false;
            }
        }


    }

}
