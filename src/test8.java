public class test8 {
//    一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
//    //num1,num2分别为长度为1的数组。传出参数
//    //将num1[0],num2[0]设置为返回结果
//public class Solution {
//    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
//
//    }
//}
    public static void main(String arg[]){
        int[]a=new int[]{1,1,2,6,2,3,3,5};
        int[]b=a;
        int count;
        int num1[] = new int[1];
        int num2[] = new int[1];
        int flag=0;
        for(int i=0;i<a.length;i++){
            count=0;
            for (int j=0;j<a.length;j++){
                if(b[j]==a[i]){
                    count=count+1;
                }
            }
            if(count==2){
                continue;
            }else if(flag==0){
                num1[0]=a[i];
                flag=1;
            }else{
                num2[0]=a[i];
            }
        }
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

}
