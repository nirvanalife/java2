import java.util.ArrayList;

public class test37 {
//    输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

    public static void main(String []arg){
        int []array=new int[]{1,2,3,4,5,6,7};
        reOrderArray(array);
        int t=1;
    }

    public static void reOrderArray(int [] array) {
        int len=array.length;
        ArrayList<Integer> jishu=new ArrayList<>();
        ArrayList<Integer> oushu=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(array[i]%2==0){
                oushu.add(array[i]);
            }else{
                jishu.add(array[i]);
            }
        }
        int newA[]=new int[len];
        for (int i=0;i<jishu.size();i++){
            newA[i]=jishu.get(i);
        }
        for (int i=0;i<oushu.size();i++){
            newA[i+jishu.size()]=oushu.get(i);
        }
        for (int i=0;i<array.length;i++){
            array[i]=newA[i];
        }


    }
}
