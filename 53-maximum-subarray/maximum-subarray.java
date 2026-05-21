class Solution {
    public int maxSubArray(int[] nums) {
       int currsum=nums[0];
       int subarr=nums[0];
       for(int i=1;i<nums.length;i++){
        currsum=Math.max(nums[i],nums[i]+currsum);
        subarr=Math.max(subarr,currsum);
       }
        
        return subarr;
    }
}