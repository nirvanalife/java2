public class test74 {
//
//    给定一个数组arr，返回子数组的最大累加和
//    例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
    /**
     * 基本思路：arr[i]=Math.max(arr[i],arr[i-1]+arr[i]);
     *          max=Math.max(arr[i],arr[i-1]);
     * 新数组的当前元素是当前元素和当前元素与前一个加和中大的一个，这样累加元素找到最大
     */
    public static void main(String []arg){
        int []a=new int[]{1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxsumofSubarray(a));
    }
    /**
     * max sum of the subarray
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public static int maxsumofSubarray (int[] arr) {
        // write code here
        if(arr.length==0){
            return 0;
        }
        int max=0;
        for (int i=1;i<arr.length;i++){
            arr[i]=Math.max(arr[i],arr[i-1]+arr[i]);
            max=Math.max(arr[i],arr[i-1]);

        }

        return max;
    }
}
