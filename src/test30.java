import java.util.HashMap;
import java.util.Map;

public class test30 {
//    输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
//    假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
//    序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
    //思路：如果弹出序列在压入序列中的index开始变小，那么他后面的index不能连续增大，另外要考虑判断弹出的是否压入
    public static void main(String []arg){
        int []pushA=new int[]{1};
        int []popA=new int[]{4};
        System.out.println(IsPopOrder(pushA,popA));


    }
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        int length=popA.length;
        Map<Integer,Integer> index=new HashMap();
        int []flag=new int[length];
        for (int i=0;i<length;i++){
            flag[i]=0;
        }
        for (int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(pushA[i]==popA[j]){
                    flag[i]=1;
                    break;
                }
            }
        }
        for (int i=0;i<length;i++){
            if(flag[i]==0){
                return false;
            }
        }
        for (int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                if(pushA[j]==popA[i]){
                    index.put(popA[i],j);
                }
            }
        }

        for (int i=0;i<length-1;i++){
            if(index.get(popA[i])>index.get(popA[i+1])){
                for (int j=i+1;j<length-1;j++){
                    if(index.get(popA[j])<index.get(popA[j+1])){
                        return false;
                    }
                }
                return true;
            }
        }



        return true;
    }
}
