import java.util.Stack;

public class test85 {
//给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
//括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
    public static void main(String []arg){
        String s="()";
        System.out.println(isValid(s));
    }

    /**
     *
     * @param s string字符串
     * @return bool布尔型
     * 这种方法是针对。。{()}的。。
     *
     */
    public static boolean isValid1 (String s) {
        // write code here
        if(s==null){
            return false;
        }
        if(s.length()==1){
            return false;
        }
        int []x=new int[s.length()];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='{'){
                x[i]=-1;
            }else if(c=='}'){
                x[i]=1;
            }else if(c=='['){
                x[i]=-2;
            }else if(c==']'){
                x[i]=2;
            }else if(c=='('){
                x[i]=-3;
            }else if(c==')'){
                x[i]=3;
            }else{
                x[i]=0;
            }
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<x.length;i++){
            stack.push(x[i]);
        }
        int i=0;
        if(x[0]+x[1]==0){

        }
        while(!stack.isEmpty()){
            int a=stack.pop();
            int b=x[i++];
            if(a+b!=0){
                return false;
            }
        }
       return true;
    }
    /**
     *
     * @param s string字符串
     * @return bool布尔型
     * 思路：遇到左括号栈输入右括号，遇到右括号输出stack看是不是和左括号输入匹配，return避免只有一边括号
     */
    public static boolean isValid (String s){
        // write code here
        if(s==null){
            return false;
        }
        if(s.length()==1){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()) {
            if(c=='{'){
                stack.push('}');
            }else if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
