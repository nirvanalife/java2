import java.util.ArrayList;

public class test114 {
    /**
     * 给出n对括号，请编写一个函数来生成所有的由n对括号组成的合法组合。
     *
     */
    public static ArrayList<String> l=new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> list=generateParenthesis(3);
        int x=0;
    }
    /**
     *
     * @param n int整型
     * @return string字符串ArrayList
     */
    public static ArrayList<String> generateParenthesis (int n) {
        // write code here

        g("",0,0,3);
        return l;
    }
    public static void g (String s,int left,int right,int n){
        if(right==n){
            l.add(s);
            return;
        }
        if(left<n){
            g(s+'(',left+1,right,n);
        }
        if(left>right){
            g(s+')',left,right+1,n);
        }
    }


}
