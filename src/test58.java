public class test58 {
//    在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
    public static int res = 0 ; //记录统计结果

    public static int InversePairs(int [] array) {
//        if(array.length==0){
//            return 0;
//        }
//        int sum=0;
//        for (int i=0;i<array.length;i++){
//            for(int j=i+1;j<array.length;j++){
//                if(array[i]>array[j]){
//                    sum++;
//                }
//            }
//        }
//        return sum;
        if(array.length==0)
            return 0;
        mergeSort(array,0,array.length-1);
        return res;

    }
    public static void mergeSort(int []array,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,high,mid);
    }
    public static void merge(int []array,int low,int high,int mid){
        int []temp=new int[high-low+1];
        int i=0;
        int p1=low; // 左边数组的起点
        int p2=mid+1;// 右边数组的起点
        // p1 , p2 比较哪个小把哪个放到temp
        while(p1<=mid&&p2<=high){
            if(array[p1]<=array[p2]){
                temp[i++]=array[p1++];
            }else{
                temp[i++]=array[p2++];
                res=(res+mid-p1+1)%1000000007;
            }
        }
        //说明左边全部添加到temp中，继续添加右边
        if(p1>mid){
            while(p2<=high){
                temp[i++]=array[p2++];
            }
        }
        //说明右边全部添加到temp中，继续添加左边
        if(p2>high){
            while(p1<=mid){
                temp[i++]=array[p1++];
            }
        }
        //在原数组中用有序的值覆盖掉原来无序的值
        for (int j=0;j<temp.length;j++){
            array[low+j]=temp[j];
        }

    }

    public static void main(String []arg){
        int []array=new int[]{1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(array));

    }
}
