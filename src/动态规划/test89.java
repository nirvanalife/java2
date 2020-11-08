public class test89 {
//    一个机器人在m×n大小的地图的左上角（起点，下图中的标记“start"的位置）。
//    机器人每次向下或向右移动。机器人要到达地图的右下角。（终点，下图中的标记“Finish"的位置）。
//    可以有多少种不同的路径从起点走到终点？
      public static void main(String []arg){
        int m=2;
        int n=2;
        System.out.println(uniquePaths(m,n));
      }
    /**
     *
     * @param m int整型
     * @param n int整型
     * @return int整型
     */
    public static int uniquePaths (int m, int n) {
        // write code here
        int [][]fp=new int[m][n];
        fp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    fp[i][j]=1;
                }else{
                    fp[i][j]=fp[i-1][j]+fp[i][j-1];
                }

            }
        }
        return fp[m-1][n-1];
    }
}
