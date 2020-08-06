import java.util.ArrayList;
import java.util.Collections;

public class test45 {
//    给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
//    他们的最大值分别为{4,4,6,6,6,5}；
//    针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
//    {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
    public static void main(String []arg){
        int []num=new int[]{2,3,4,2,6,2,5,1};
        int size=3;
        maxInWindows(num,size);

    }
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> max=new ArrayList<>();
        if(size==0){
            return list;
        }
        if(num.length==0){
            return list;
        }
        if(num.length<size){

            return max;
        }
        for (int i=0;i<num.length-size+1;i++){
            for (int j=i;j<i+size;j++){
                list.add(num[j]);
            }
            max.add(Collections.max(list));
            list.clear();
        }
        return max;
    }
}
