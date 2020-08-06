public class test4 {
    //不用+，-，/，*实现加法
    public static void main(String []arg){
        int num1=9;
        int num2=4;
        int sum=0;
        while(num2!=0){
            sum=num1^num2;
            int carry=(num1&num2)>>1;
            num1=sum;
            num2=carry;
        }
        System.out.println(sum);
    }
}
