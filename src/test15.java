public class test15 {
//    统计一个数字在排序数组中出现的次数。
//    思路：从第一个相同开始向前遍历
    public static void main(String []a){
        int []array=new int[]{1,2,3,3,3,3};
        int k=3;

        int n=array.length;
        int count=0;
        for (int i=0;i<n;i++){
            while(array[i]==k){
                 count=count+1;
                    if(i+1<n){
                        i=i+1;
                    }
                    else{
                        break;
                    }
                }
                if(count>0){
                    break;
                }

        }
        System.out.println(count);
    }

}
