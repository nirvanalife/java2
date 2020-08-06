import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class test42 {
//    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
//            1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//    则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
    public static void main(String []arg){
        int [][]matrix=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printMatrix(matrix));

    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        int len1=matrix.length;
        int len2=matrix[0].length;

        ArrayList<Integer> list=new ArrayList<>();
        if(len1==0||len2==0){
            return null;
        }
        //只有一行
        if(len1==1){
            for (int i=0;i<len2;i++){
                list.add(matrix[0][i]);
            }
            return list;
        }
        //只有一列
        if(len2==1){
            for (int i=0;i<len1;i++){
                list.add((matrix[i][0]));
            }
            return list;
        }
        ArrayList<Integer> temp=new ArrayList<>();
        for (int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                temp.add(matrix[i][j]);
            }
        }
        int min=Collections.min(temp);

        return null;
    }

}
