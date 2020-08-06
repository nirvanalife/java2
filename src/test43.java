import java.util.ArrayList;

public class test43 {
//    把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
    public static void main(String []arg){
        int index=15;
        System.out.println(GetUglyNumber_Solution1(index));
    }
    public static int GetUglyNumber_Solution1(int index) {
        if(index<=0)
        {
            return 0;
        }

        int i=1;

        ArrayList <Integer> list=new ArrayList<>();
        while(list.size()<index){
                int temp=i;
                while(i%2==0){
                    i=i/2;
                }
                while(i%3==0){
                    i=i/3;

                }
                while(i%5==0){
                    i=i/5;
                }
                if(i==1){
                    list.add(temp);

                }
                i=temp+1;

        }
        return list.get(index-1);
    }

    public static int GetUglyNumber_Solution(int index){
        if(index<=0){
            return 0;
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        int p2=0;
        int p3=0;
        int p5=0;
        int num=0;
        while(list.size()<index){
            num=Math.min(list.get(p2)*2,Math.min((list.get(p3)*3),list.get(p5)*5));
            if(num==list.get(p2)*2) p2++;
            if(num==list.get(p3)*3) p3++;
            if(num==list.get(p5)*5) p5++;
            list.add(num);
        }
        return list.get(index-1);
    }
}
