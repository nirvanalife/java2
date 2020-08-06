import java.util.ArrayList;

public class test20 {
//    输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
//    对应每个测试案例，输出两个数，小的先输出。
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        return null;
    }

    public static void main(String []arg){
        int[] array=new int[]{1,2,3,4,5,6};
        int sum=6;
        int multy=9999;
        int length=array.length;
        int min=0;
        int max=0;
        int flag=0;
        for (int i=0;i<length;i++){
            for (int j=i;j<length;j++){
                if(array[i]+array[j]==sum){
                    int c=array[i]*array[j];
                    if(c<multy){
                        multy=c;
                        min=array[i];
                        max=array[j];
                        flag=1;
                    }
                }
            }
        }
        ArrayList<Integer> x=new ArrayList<>();
        if(flag==1){
            x.add(min);
            x.add(max);
        }

        System.out.println(x);

    }

}
