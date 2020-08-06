public class test13 {
    public static void main(String []arg){

        int exponent=2;
        double base=2.1;

//        System.out.println(Math.pow(base,exponent));
    }

    public static double power(double base,int exponent){
//        实现power函数
//        思路：区分底数为0和指数<0情况
        if(base==0){
            if(exponent>0){
                return 0;
            }else if(exponent==0){
                return 1;
            }else{
                return -1;
            }
        }else{
            if(exponent==0){
                return 1;
            }else if(exponent>0){
                return base*power(base,exponent-1);
            }else{
                return 1/base*power(base,exponent+1);
            }
        }

    }
}
