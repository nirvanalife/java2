import java.util.Arrays;

public class test14 {
//    汇编语言中有一种移位指令叫做循环左移（ROL），
//    现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
//    对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
//    例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
//    即“XYZdefabc”。是不是很简单？OK，搞定它！

    public static void main(String []a){
        String str="abcXYZdef";
        int n=3;
        char []ch=str.toCharArray();
        char []t=ch.clone();
        int length=str.length();
        for (int i=0;i<length;i++){
            int x=(i+3)%length;
            ch[i]=t[x];
        }
        str=String.copyValueOf(ch);
        System.out.println(str);

    }

    public String LeftRotateString(String str,int n) {

        return null;
    }
}
