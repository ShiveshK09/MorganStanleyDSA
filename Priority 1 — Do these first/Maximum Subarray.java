//https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],cursum=nums[0];
        for(int i=1;i<nums.length;i++){
            cursum=Math.max(nums[i],cursum+nums[i]);
            max=Math.max(max,cursum);
        }
        return max;
    }
}
