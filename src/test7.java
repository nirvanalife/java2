public class test7 {
//    求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
//    思路1：公式 (1+n)*n*0.5
//    思路2：逻辑与短路
//    解题思路：
//1.需利用逻辑与的短路特性实现递归终止。 2.当n==0时，(n>0)&&((sum+=Sum_Solution(n-1))>0)只执行前面的判断，为false，然后直接返回0；
//3.当n>0时，执行sum+=Sum_Solution(n-1)，实现递归计算Sum_Solution(n)。
//    public int Sum_Solution(int n) {
//        int sum = n;
//        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
//        return sum;
//    }
    public static void main(String []arg){
        int n=5;
        int x=add(n);
        System.out.println(x);
    }
    public static int add(int n){
        int x= (int) ((1+n)*n*0.5);
        return x;
    }
}
