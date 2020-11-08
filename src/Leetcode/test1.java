package Leedcode;

public class test1 {
//    给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
    public static void main(String[] args) {
        int []nums={8,1,2,2,3};
        int []result=smallerNumbersThanCurrent(nums);
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int []count=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count[i]++;
                }
            }
        }

        return count;
    }
}
