public class test5 {
//    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
//    f(1)=1
//    f(2)=f(2-1)+f(2-2)=2
//    f(n)=f(n-1)+f(n-2)+...+f(n-n)=f(n-1)+f(n-1)=2*f(n-1)
//    f(n-1)=f(n-1-1)+f(n-1-2)+...+f(n-1-n-1)=f(n-2)+f(n-3)+...+f(0)

    public static void main(String []arg){
        int n=3;
        System.out.println(calc(n));;


    }
    public static int calc(int x){
        if(x==1){
            return 1;
        }else{
            return 2*calc(x-1);
        }

    }

}
