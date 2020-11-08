public class test67 {
//    请实现有重复数字的有序数组的二分查找。
//输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
    public static void main(String []arg){
        String str="abcd";
        System.out.println(solve(str));
    }
    /**
     * 反转字符串
     * @param str string字符串
     * @return string字符串
     */
    public static String solve (String str) {
        // write code here
        if(str.length()==0){
            return null;
        }
        char []c=str.toCharArray();

        char []newC=new char[c.length];
        int j=0;
        for (int i=c.length-1;i>=0;i--){
            newC[j++]=c[i];
        }
        return String.valueOf(newC);
    }


}
