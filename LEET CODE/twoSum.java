/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/

import java.util.Arrays;
public class twoSum{
    public static void main(String[] args) {
        int[] nums = {5,6,8};
        int target = 13;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
    int [] arr=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }   
            }   
        }
        int Arr[]={}; //created the null array because we have to return something in the false condition.
        return Arr;
}
}
