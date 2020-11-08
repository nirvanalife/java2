package 回溯;
import java.util.ArrayList;


public class test113 {
    /*
    给出一组数字，返回该组数字的所有排列
例如：
[1,2,3]的所有排列如下
[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2], [3,2,1].
（以数字在数组中的位置靠前为优先级，按字典序排列输出。）
     */
    public static void main(String[] args) {
        int []num={1,2,3};
        permute(num);
    }
    public static ArrayList<ArrayList<Integer>> permute(int []num){
        int length=num.length;
        int size=1;
        for(int i=length;i>=0;i--){
            size=size*i;
        }

        return null;
    }
}
