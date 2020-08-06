public class test18 {
//    输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
    public static void main(String []arg){
        long n=2147483647;
        long q=n;
        int count=0;
        if(n>0){
            for (int i=31;i>=0;i--){
                long a=(int)Math.pow(2,i);
                if(a>n){
                    count=count+0;
                }else{
                    count=count+1;
                    n=n-a;
                }
            }
        }else{
            n=Math.abs(n)-1;
            for (int i=31;i>=0;i--){
                int a=(int)Math.pow(2,i);
                if(a>=n){
                    count=count+1;
                }else{
                    count=count+0;
                    n=n-a;
                }
            }
        }
        System.out.println(count);
        NumberOf1(q);
    }
    public static int NumberOf1(long n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
        return count;

    }

}
