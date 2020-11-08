public class test98 {
//已知int一个有序矩阵mat，同时给定矩阵的大小n和m以及需要查找的元素x，且矩阵的行和列都是从小到大有序的。设计查找算法返回所查找元素的二元数组，代表该元素的行号和列号(均从零开始)。保证元素互异。

public static class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }

}
    public static void main(String[] args) {
        int [][]mat={{1,2,3},{4,5,6}};
        int []result=findElement(mat,2,3,6);

    }
    public static int[] findElement(int[][] mat, int n, int m, int x) {
        // write code here
        if(m<0||n<0){
            return null;
        }
        if(mat==null){
            return null;
        }
        int []result=new int[2];
        for(int i=0;i<n;i++){
            if(mat[i][0]<=x&&mat[i][m-1]>=x){
                for(int j=0;j<m;j++){
                    if(mat[i][j]==x){
                        result[0]=i;
                        result[1]=j;
                    }

                }
            }
        }

        return result;
    }
}
