public class test1 {
    public static void main(String []arg){
//        给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
//        不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
        int []A=new int[]{0,1,2,3,4,5};
        int []B=new int[]{1,1,1,1,1,1};
        int n=A.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
               if(i==j){
                   continue;
               }else{
                   B[i]=B[i]*A[j];
               }
            }
        }

    }
}
