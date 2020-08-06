public class test19 {
//    求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有
//    1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
//    可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。

//    思路：思路：按位数计算
//
//个位的1每10出现一次
//
//十位的1每百出现10次
//
//。。。
//
//10^n位的1每10^(n+1)出现10^n次
//
//
//
//对于不足10^(n+1)部分
//
//判断是否大于10^(n)*2是正常加上去
//
//小于10^n不加
//
//等于10^n
//
//加上 y-10^n+1 其中y是数num%10^(n+1)余数

    public static void main(String []arg){
        int n=13;
        int i=0;
        int a= (int) Math.pow(10,i);
        while(a<=n){
            i=i+1;
            a=(int) Math.pow(10,i);
        }
        int p= i;
        int sum=0;
        for (int t=1;t<=p;t++){
            int temp= (int) Math.pow(10,t);
            int x=n/temp;
            int y=n%temp;
            int m=(int) Math.pow(10,t-1);
            if(y>=2*m){
                sum=sum+x*m+m;
            }else if(y<m){
                sum=sum+x*m;
            }else{
                sum=sum+x*m+y-m+1;
            }

        }
        System.out.println(sum);
    }

}
