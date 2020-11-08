

public class test80 {
//    编写一个函数来查找字符串数组中的最长公共前缀。
    public static void main(String arg[]){
        String []str={"abca","abc","abca","abc","abcc"};

        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix (String[] strs) {
        // write code here
        if(strs.length == 0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int min=100;
        int minIndex=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0){
                return "";
            }
        }
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                minIndex=i;
            }
        }
        int []count=new int[strs.length];
        String temp=strs[minIndex];
        for(int i=0;i<strs.length;i++){
            String x=strs[i];
            for(int j=0;j<min;j++){
                if(x.substring(j,j+1).equals(temp.substring(j,j+1))){
                    count[i]++;
                }
            }
        }
        min=100;
        for (int i=0;i<count.length;i++){
            if(count[i]==0){
                return "";
            }
            if(count[i]<min){
                min=count[i];
            }
        }

        return temp.substring(0,min);
    }
}
