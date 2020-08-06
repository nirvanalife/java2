import java.util.Arrays;

public class test36 {
    //    输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
    //  思路：1.空返回“”
//            把不同长度的用最后一位补充成相同长度比较大小从小到大使用原数组组成字符串
//    如果补充后相同，相同n次+n
    public static void main(String[] arg) {
        int[] numbers = new int[]{1,11,111};
        System.out.println(PrintMinNumber(numbers));
    }

    public static String PrintMinNumber(int[] numbers) {
        int min = 999;
        int minIndex = -1;
        int l=0;

        if (numbers.length == 0) {
            return "";
        }
        int len = numbers.length;
        int []temp=new int[len];
        for (int i = 0; i < len; i++) {
            String str = Integer.toString(numbers[i]);
            char[] ch = str.toCharArray();
            if(ch.length>l){
                l=ch.length;
            }

        }
        for (int i=0;i<len;i++){
            String str = Integer.toString(numbers[i]);
            char[] ch = str.toCharArray();
            int d =l-ch.length;
            char[] nch=new char[l];
            for (int j=0;j<ch.length;j++){
                nch[j]=ch[j];
            }
            for (int j=0;j<d;j++){
                nch[j+ch.length]=nch[j+ch.length-1];
            }
            String s= String.valueOf(nch);
            temp[i]=Integer.parseInt(s);


        }
        int cc=1;
        int index[]=new int[temp.length];
        for (int i=0;i<temp.length;i++){
            for (int j=i+1;j<temp.length;j++){
                if(temp[i]==temp[j]){

                    temp[j]=temp[j]+cc;
                    cc++;
                }
            }
        }
        int []count=temp.clone();
        Arrays.sort(temp);

        for (int i=0;i<temp.length;i++){
            for (int j=0;j<temp.length;j++){
                if(temp[i]==count[j]){
                    index[i]=j;
                }
            }
        }
        int []c=new int[numbers.length];
        StringBuilder s = new StringBuilder();
        for (int i=0;i<numbers.length;i++){
            c[i]=numbers[index[i]];

            s.append(c[i]);
        }

        return s.toString();
    }
}
