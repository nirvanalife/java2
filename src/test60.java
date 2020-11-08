public class test60 {
//    从0,1,2,...,n这n+1个数中选择n个数，找出这n个数中缺失的那个数，要求O(n)尽可能小。
    public static void main(String []arg){
        int arr[]=new int[]{0,1,2,3,4,5,7};
        System.out.println(maxsumofSubarray(arr));
    }
    public static int maxsumofSubarray (int[] arr) {
        // write code here
        if(arr.length==0){
            return 0;
        }
        int sum=(0+arr.length)*(arr.length+1)/2;
        int s=0;
        for (int i=0;i<arr.length;i++){
            s=s+arr[i];
        }
        int x=sum-s;
        return x;
    }
}
