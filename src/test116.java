public class test116 {
    //一个数组A中存有N（N&gt0）个整数，在不允许使用另外数组的前提下，将每个整数循环向右移M（M>=0）个位置，
    // 即将A中的数据由（A0 A1 ……AN-1 ）变换为（AN-M …… AN-1 A0 A1 ……AN-M-1 ）（最后M个数循环移至最前面的M个位置）。如果需要考虑程序移动数据的次数尽量少，要如何设计移动的方法？
    public static void main(String[] args) {
        int []num={1,2,3,4,5,6};
        int []x=solve(6,2,num);
        int y=0;
    }
    /**
     * 旋转数组
     * @param n int整型 数组长度
     * @param m int整型 右移距离
     * @param a int整型一维数组 给定数组
     * @return int整型一维数组
     */
    public static int[] solve (int n, int m, int[] a) {
        // write code here
        int []r=new int[n];
        for(int i=0;i<n;i++){

        }

        return null;
    }
}
