public class test12 {
//    一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     public static void main(String[] arg){
        int n=5;
        int[] count=new int[n+1];
        count[0]=1;
        count[1]=1;
        for(int i=2;i<=n;i++){
            count[i]=count[i-1]+count[i-2];
        }
         System.out.println(count[n]);
     }
}
