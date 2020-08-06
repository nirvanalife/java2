public class test35 {
//在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
//思路：ascii码共128个，设置一个256长度的int 数组 count 存储每个字符对应的ascii码出现的个数，对于count==1的，遍历ch数组，找到对应的字符的位置返回



    public static void main(String []arg){
        String s="google";
        System.out.println(FirstNotRepeatingChar(s));


    }

    public static int FirstNotRepeatingChar(String str) {
        char []ch=str.toCharArray();
        int length=ch.length;
        int []index=new int[256];
        if(length==0){
            return -1;
        }
        int []count=new int[256];
        for (int i=0;i<count.length;i++){
            count[i]=0;
            index[i]=0;
        }

        int flag=1;
        for (int i=0;i<length;i++){
            int x=ch[i];

            if(count[ch[i]]==0){

                index[ch[i]]=1;

            }else {
                index[ch[i]]=-1;
            }
            count[x]=count[x]+1;
        }
        for (int i=0;i<ch.length;i++){
            if(index[ch[i]]==1){
                    return i;
                }
            }


        return -1;
    }
}
