public class test40 {
//    在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
//    每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
//    判断数组中是否含有该整数。
    public static void main(String []arg){
        int [][]array=new int[][]{{}};
        int target=7;
        System.out.println(Find(target,array));
    }
    public static boolean Find(int target, int [][] array) {
        if(array.length==0||array[0].length==0){
            return false;
        }
        int len1=array.length;
        int len2=array[0].length;
        if(target<array[0][0]||target>array[len1-1][len2-1]){
            return false;
        }

        for (int i=0;i<len1;i++){
            if(target>=array[i][0]&&target<=array[i][len2-1]){
                for (int j=0;j<len2;j++){
                    if(target==array[i][j]){
                        return true;
                    }
                }
            }
        }


        return false;
    }
}
