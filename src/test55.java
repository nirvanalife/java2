public class test55 {
//    地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
//    但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
//    但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？

//    思路：首先建立每个位置数值矩阵，从（0，0）开始遍历，分别计算上下左右，判断i，j是否越界，pass用来判断是否遍历过，遍历过直接return

    static int count=0;
    public static void main(String []arg){
        int x=35;
        String s=Integer.toString(x);
        int threshold=10;
        int rows=1;
        int cols=100;
        System.out.println(movingCount(threshold,rows,cols));
    }

    public static int movingCount(int threshold, int rows, int cols)
    {
        if(threshold==0){
            return 1;
        }
        if(threshold<0||rows<=0&&cols<=0){
            return 0;
        }
        int [][]matrix=genMatrix(threshold,rows,cols);
        boolean[] pass = new boolean[rows*cols];
        counting(0,0,matrix,pass,rows,cols,threshold);

        return count;
    }
    public static void counting(int i,int j,int [][]matrix,boolean []pass,int rows,int cols,int k){
        if(i<0||j<0||i>=rows||j>=cols||pass[i*rows+j]==true){
            return;
        }
        if(matrix[i][j]<=k){
            count++;
            pass[i*rows+j]=true;
        }else{
            pass[i*rows+j]=false;
            return;
        }
        counting(i-1,j,matrix,pass,rows,cols,k);
        counting(i+1,j,matrix,pass,rows,cols,k);
        counting(i,j-1,matrix,pass,rows,cols,k);
        counting(i,j+1,matrix,pass,rows,cols,k);

    }

    public static int[][] genMatrix(int threshold, int rows, int cols){

        int [][]matrix=new int[rows][cols];
        for(int i=0;i<rows;i++){
            String s=Integer.toString(i);
            int sum=0;
            for(int p=0;p<s.length();p++){
                sum=sum+Integer.parseInt(String.valueOf(s.charAt(p)));
            }
            for(int j=0;j<cols;j++){
                String s2=Integer.toString(j);
                int sum2=0;
                for(int p=0;p<s2.length();p++){
                    sum2=sum2+Integer.parseInt(String.valueOf(s2.charAt(p)));
                }
                matrix[i][j]=sum+sum2;
            }
        }
    return matrix;

    }
}
