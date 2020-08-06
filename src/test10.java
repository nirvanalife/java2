
public class test10 {
//    给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），
//    每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，
//    我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
//    思路：f[j]*maxf[i-j]; 第二层便利给出每个小于n的最好方法
    public static void main(String []s){
        int target=8;
        int n;
        int []a=new int[(int)(target/2)];
        int maxf[]=new int[target+1];
        int t;
        for (int i=0;i<=target;i++){
            maxf[i]=i;
        }
        int max=0;

         for (int i=2;i<=target;i++){
             n=(int)(i/2);
             if(i!=target){

                 for (int j=0;j<=n;j++){
                     t=maxf[j]*maxf[i-j];
                     if(t>max){
                         max=t;
                     }
                 }
                 if(max>maxf[i]){
                     maxf[i]=max;
                 }

                 max=0;
             }else{
                 for (int j=1;j<=n;j++){
                     t=maxf[j]*maxf[i-j];
                     if(t>max){
                         max=t;
                     }
                 }

                 maxf[i]=max;


                 max=0;
             }

         }

        System.out.println(maxf[target]);

    }




}
