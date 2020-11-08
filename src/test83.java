import java.util.ArrayList;
// TODO: 2020/10/17 时间复杂度过大

public class test83 {
//    给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)。
    public static void main(String []arg){
        int []a=new int[]{2,2,3,4,3};
        System.out.println(maxLength(a));
    }
    /**
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public static int maxLength (int[] arr) {
        // write code here
        if(arr.length==0){
            return 0;
        }
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int i=0;i<arr.length;i++){
//            if(!list.contains(arr[i])){
//                list.add(arr[i]);
//            }
//        }
//
//        return list.size();

        return 0;
    }
}
