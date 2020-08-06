public class test26 {
//    数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
//    由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
    public static void main(String []arg){
        int []array=new int[]{1,2,3,2,2,2,5,4,2};
        int length=array.length;
        int []count=new int[length];
        int flag=0;
        for (int i=0;i<length;i++){
            count[i]=0;
        }

        for (int i=0;i<length;i++){
            for (int j=i;j<length;j++){
                if(array[i]==array[j]){
                    count[i]=count[i]+1;
                }
            }
            if(count[i]>Math.floor(length/2)){
                System.out.println(array[i]);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(0);
        }
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        return 0;
    }
}
