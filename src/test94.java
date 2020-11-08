public class test94 {
//    有一个NxN整数矩阵，请编写一个算法，将矩阵顺时针旋转90度。
//
//    给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,保证N小于等于300。

    /**
     * res[j][n-i-1]=mat[i][j];
     * @param args
     */
    public static void main(String[] args) {
        int [][]mat=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int [][]result=rotateMatrix(mat,3);
    }
    public static int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
        if(n<=0){
            return null;
        }
        int [][]res=mat;
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                res[j][n-i-1]=mat[i][j];
            }
        }
        return res;
    }
}
