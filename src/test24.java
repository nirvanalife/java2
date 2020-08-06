public class test24 {
//    把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
//    输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
//    例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
//    NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

    public static void main(String []arg){
        int []array=new int[]{3,4,5,1,2};
        int min=9999;
        int minI=0;
        int length=array.length;
        for (int i=0;i<length;i++){
            if(array[i]<min){
                min=array[i];
                minI=i;
            }
        }
        int []array1=new int[minI];
        int []array2=new int[length-minI];
        for (int i=0;i<minI;i++){
            array1[i]=array[i];
        }
        for (int i=0;i<length-minI;i++){
            array2[i]=array[i+minI];
        }
        for (int i=0;i<array2.length;i++){
            array[i]=array2[i];
        }
        for (int i=0;i<array1.length;i++){
            array[i+array2.length]=array1[i];
        }
        System.out.println(array[0]);
    }

//    public int minNumberInRotateArray(int [] array) {
//
//    }


}
