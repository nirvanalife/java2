public class test86 {
//    实现函数 int sqrt(int x).
//    计算并返回x的平方根
    public static void main(String []arg){
        int x=2;
        System.out.println(sqrt(x));
    }
    /**
     *
     * @param x int整型
     * @return int整型
     */
    public static int sqrt (int x) {
        // write code here
        int l=1;
        int r=x;

        while(l<=r){
            int m=l+(r-1)/2;
            if(x/m==m){
                return m;
            }else if(x/m<m){
                r=m-1;
            }else if(x/m>m){
                l=m+1;
            }
        }
        return r;
    }

}
