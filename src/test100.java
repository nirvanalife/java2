import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test100 {
    /**
     * 给出一个转动过的有序数组，你事先不知道该数组转动了多少
     * (例如,0 1 2 4 5 6 7可能变为4 5 6 7 0 1 2).
     * 在数组中搜索给出的目标值，如果能在数组中找到，返回它的索引，否则返回-1。
     * 假设数组中不存在重复项。
     * @param args
     */
    public static void main(String[] args) {
        int []A={0,1,2,4,5,6,7};
        System.out.println(search(A,3));
    }
    /**
     *
     * @param A int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public static int search (int[] A, int target) {
        // write code here
        if(A.length==0){
            return -1;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<A.length;i++){
            list.add(A[i]);
        }
        int x=list.indexOf(target);
        if(x>=0&&x<A.length){
            return x;
        }
        return -1;
    }

}
