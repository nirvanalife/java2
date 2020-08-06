public class test23 {
//    F[n]=F[n-1]+F[n-2](n>=3,F[1]=1,F[2]=1)
//    大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
//    n<=39
        public static void main(String []a){
            int []F=new int[40];
            int n=0;
            F[0]=0;
            F[1]=0;
            for (int i=2;i<=39;i++){
                F[i]=F[i-1]+F[i-2];
            }
            System.out.println(F[0]);
        }
//        public int Fibonacci(int n) {
//
//         }

}
