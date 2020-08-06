public class test17 {
//    HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:
//    在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
//    但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
//    连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？
//            (子向量的长度至少是1)
//    思路：遍历，要注意max设置

    public static void main(String []a){
        int []array=new int[]{-2,-8,-1,-5,-9};
        int length=array.length;
        int []count=new int[length];
        for (int i=0;i<length;i++){
            count[i]=0;
        }
        int sum=0;
        int max=-9999;
        for (int i=0;i<length;i++){

            for (int j=i;j<length;j++){
                sum=sum+array[j];
                if(sum>max){
                    max=sum;
                }
            }
            count[i]=max;
            max=-9999;
            sum=0;

        }
        max=-9999;
        for (int i=0;i<length;i++){
            if(count[i]>max){
                max=count[i];
            }
        }
        System.out.println(max);
    }
    public int FindGreatestSumOfSubArray(int[] array) {
        return 0;
    }
}
