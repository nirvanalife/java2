public class test90 {
//    在不使用额外的内存空间的条件下判断一个整数是否是回文数字
//    提示：
//负整数可以是回文吗？（比如-1）
//如果你在考虑将数字转化为字符串的话，请注意一下不能使用额外空间的限制
//你可以将整数翻转。但是，如果你做过题目“反转数字”，你会知道将整数翻转可能会出现溢出的情况，你怎么处理这个问题？
    public static void main(String []arg){
        int x=121;
        System.out.println(isPalindrome(x));
    }
    /**
     *
     * @param x int整型
     * @return bool布尔型
     */
    public static boolean isPalindrome (int x) {
        // write code here
        if(x<0){
            return false;
        }
        int y=x;
        int result=0;
        while(x!=0){
            result=result*10+x%10;
            x=x/10;
        }
        if(result>Integer.MAX_VALUE){
            return false;
        }
        return y==result;
    }


}
