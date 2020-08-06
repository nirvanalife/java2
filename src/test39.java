public class test39 {
//    请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    public static void main(String []arg){
        StringBuffer str=new StringBuffer("We Are Happy");
        replaceSpace(str);

    }
    public static String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
        String s=str.toString();
        char ch[]=s.toCharArray();
        int count=0;
        for (int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                count++;
            }
        }
        for (int i=0;i<count;i++){
            int t=str.indexOf(" ");
            str.replace(t,t+1,"%20");
        }
        int t=1;
        return str.toString();
    }
}
