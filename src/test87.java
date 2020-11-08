public class test87 {
//    给定一棵树，求出这棵树的直径，即两个节点距离的最大值。

      public static class Interval {
        int start;
        int end;
      }
      public static void main(String []arg){
         int n=6;
         Interval []tr=new Interval[6];
         tr[0].start=0;
         tr[0].end=1;
         tr[1].start=1;
         tr[1].end=5;
         tr[2].start=1;
         tr[2].end=2;
         tr[3].start=2;
         tr[3].end=3;
         tr[4].start=2;
         tr[4].end=4;
         int[] Edge_value=new int[]{3,4,2,1,5};
          System.out.println(solve(6,tr,Edge_value));
      }
    /**
     * 树的直径
     * @param n int整型 树的节点个数
     * @param Tree_edge Interval类一维数组 树的边
     * @param Edge_value int整型一维数组 边的权值
     * @return int整型
     */
    public static int solve (int n, Interval[] Tree_edge, int[] Edge_value) {
        // write code here
        int [][]tree=new int[n][n];
        for(int i=0;i<Tree_edge.length;i++){
            int start=Tree_edge[i].start;
            int end=Tree_edge[i].end;
            tree[start][end]=Edge_value[i];

        }
        return 0;
    }

}
