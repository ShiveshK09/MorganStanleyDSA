//https://leetcode.com/problems/container-with-most-water/description/
class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int ans=0;
        while(l<r){
            ans=Math.max(ans,Math.min(height[l],height[r])*(r-l));
            if(height[l]<height[r]) l++;
            else r--;
        }
        return ans;
    }
}
