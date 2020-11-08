import java.util.Arrays;

public class test114 {
    /**
     * 请写出一个高效的在m*n矩阵中判断目标值是否存在的算法，矩阵具有如下特征：
     * 每一行的数字都从左到右排序
     * 每一行的第一个数字都比上一行最后一个数字大
     */
    public static void main(String[] args) {
        int [][]matrix={{1,3}};
        System.out.println(searchMatrix(matrix,3));
    }
    public static boolean searchMatrix (int[][] matrix, int target) {
        // write code here
        if(matrix==null){
            return false;
        }

        int y=matrix.length; //行
        int x=matrix[0].length; //列
        if(y==1) {
            for (int i = 0; i < x; i++) {
                if (matrix[0][i] == target) {
                    return true;
                }
            }
            return false;
        }
        int flagy=0;
        for(int i=1;i<y;i++){
            if(target<matrix[i][0]&&target>=matrix[i-1][0]){
                flagy=i-1;
                break;
            }
        }

        for(int i=0;i<x;i++){
            if(matrix[y-1][i]==target){
                return true;
            }
        }
        for(int i=0;i<x;i++){
            if(matrix[flagy][i]==target){
                return true;
            }
        }

        return false;
    }
}
