import java.util.ArrayList;
import java.util.Arrays;

public class test48 {
//    输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
    public static void main(String []arg){
        int []input=new int[]{4,5,1,6,2,7,3,8};
        int k=4;
        System.out.println(GetLeastNumbers_Solution(input,k));
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k>input.length){
            return new ArrayList<>();
        }
        Arrays.sort(input);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;
    }
}
