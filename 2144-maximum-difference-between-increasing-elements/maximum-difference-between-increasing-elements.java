class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int max=-1;
        int low=nums[0];
        for(int i=1;i<n;i++){
            int val=nums[i];
            if(low<val){
                
                max=Math.max(max,val-low);
            }
                low=Math.min(low,val);
            
        }return max;

    }
}