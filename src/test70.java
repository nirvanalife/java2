public class test70 {
//
//    请实现有重复数字的有序数组的二分查找。
//    输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
    public static void main(String []arg){
        int []a=new int[]{1,2,4,4,5};
        System.out.println(upper_bound_(5,6,a));
    }
    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public static int upper_bound_ (int n, int v, int[] a) {
        // write code here
        if(n==0){
            return 1;
        }
        int flag=-1;
        for (int i=0;i<n;i++){
            if(a[i]>=v){
                flag=i;
                break;
            }
        }
        if(flag!=-1){
            return flag+1;
        }else{
            return n+1;
        }

    }
}
