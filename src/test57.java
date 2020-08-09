import java.util.Arrays;

public class test57 {
//    请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
//    路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
//    如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
    public static void main(String []arg){
        char []matrix=new char[]{'a','b','c','e','s','f','c','s','a','d','e','e'};
        int rows=3;
        int cols=4;
        char []str=new char[]{'a','b','c','b'};
        System.out.println(hasPath(matrix,rows,cols,str));

    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix==null||rows<=0||cols<=0||str==null){
            return false;
        }
        boolean []pass=new boolean[rows*cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                   if(matrix[i*cols+j]==str[0]){
                       if(hasPathHelper(matrix,rows,cols,str,pass,i,j)){
                           return true;
                       }
                       Arrays.fill(pass, false);
                   }
               }
            }
        return false;
    }

    public static boolean hasPathHelper(char[] matrix,int rows, int cols, char[] str,boolean []pass,int i,int j)
    {
        if(str.length==0){
            return true;
        }

        if(i<0||j<0||i>=rows||j>=cols||matrix==null|| pass[i * cols + j]){
            return false;
        }

        if(matrix[i*cols+j]==str[0]){
            pass[i*cols+j]=true;
            str=String.valueOf(str).substring(1).toCharArray();
        }else{
            return false;
        }

        boolean flag1=false,flag2=false,flag3=false,flag4=false;


            flag1=hasPathHelper(matrix,rows,cols,str,pass,i+1,j);
            if(flag1){
                return true;
            }else{
                flag2=hasPathHelper(matrix,rows,cols,str,pass,i,j+1);
                if(flag2){
                    return true;
                }else{
                    flag3=hasPathHelper(matrix,rows,cols,str,pass,i-1,j);
                    if(flag3){
                        return true;
                    }else{
                        return hasPathHelper(matrix,rows,cols,str,pass,i,j-1);
                    }
                }
            }



    }


}
