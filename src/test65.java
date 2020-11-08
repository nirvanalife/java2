import java.util.Arrays;
//返回数组中加和指定值的下标
public class test65 {
    public static void main(String []arg){
        int []A=new int[]{20,70,110,150};
        int []x=twoSum(A,90);
        int u=1;
    }
    public static int[] twoSum (int[] numbers, int target) {
        if(numbers.length==0){
            return null;
        }
        int []a=new int[2];
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    a[0]=i+1;
                    a[1]=j+1;
                }
            }

        }
        // write code here
        return a;
    }
}
