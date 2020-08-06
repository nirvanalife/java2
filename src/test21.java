import java.util.ArrayList;

public class test21 {
//    小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,
//    他马上就写出了正确答案是100。但是他并不满足于此,
//    他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
//    没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
//    现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!

//    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
//
//    }

    public static void main(String []arg){
        int sum=20;
        int n=0;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int flag=0;
        for (int i=1;i<sum;i++){
            n=0;
            ArrayList<Integer> l=new ArrayList<>();
            for (int j=i;j<sum;j++){
                n=n+j;
                if (n == sum){
                    flag=1;
                    for (int t=i;t<=j;t++){
                        l.add(t);
                    }
                    break;
                }else if(n>sum){
                    break;
                }
            }
            if(flag==1){
                list.add(l);
                flag=0;
            }


        }
        int t=1;
    }

}
