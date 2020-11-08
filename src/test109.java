import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test109 {
    /**
     * 给出一组候选数\ C C 和一个目标数\ T T，找出候选数中起来和等于\ T T 的所有组合。
     * \ C C 中的每个数字在一个组合中只能使用一次。
     * @param args
     */
    public static void main(String[] args) {
        int []x={100,10,20,70,60,10,50};
        ArrayList<ArrayList<Integer>> list=combinationSum2(x,80);
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        Arrays.sort(num);
        int res=target;
        for(int i=0;i<num.length;i++){
            while ((res>0)){
               
            }
        }
        return null;
    }
}
