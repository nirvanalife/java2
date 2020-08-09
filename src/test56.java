import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class test56 {
//    输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
//    输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
//    思路：递归，substring 截取第i个作为第一位，其他的重复permutation，其他的只有一个时候，只有一种方法，直接放入list返回，对于返回的list，遍历每一个list元素，和当前的第一个结合，放入list
    public static void main(String[] arg) {
        String str = "abc";
        System.out.println(Permutation(str));
    }



    public static ArrayList<String> Permutation(String str) {
        if(str==null||str.equals("")){
            return new ArrayList<>();
        }

        return Perm(str);
    }


    public static ArrayList<String> Perm(String str){
        ArrayList<String> slist=new ArrayList<>();
        ArrayList<String> list=new ArrayList<>();
       if(str.length()==1){
           slist.add(str);
           return slist;
       }
       for(int i=0;i<str.length();i++){
           String str1=str.substring(i,i+1);

           String nstr=str.substring(0,i)+str.substring(i+1,str.length());

           slist=Perm(nstr);
           for(int j=0;j<slist.size();j++){
               String str2=str1+slist.get(j);
               list.add(str2);

           }

       }
       ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(result.contains(list.get(i))){

            }else{
                result.add(list.get(i));
            }
        }
        Collections.sort(result);
        return result;

    }


}
