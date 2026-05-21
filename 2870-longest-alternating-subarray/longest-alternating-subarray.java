class Solution {
    public int alternatingSubarray(int[] nums) {
        
        int max=-1;
        int current=1;
        int expectedDiff=1;
        for(int i=1;i<nums.length;i++){
            int diff=nums[i]-nums[i-1];
            if(diff==expectedDiff){
                current++;
                expectedDiff *=-1;
            }
            else if(diff==1){
              current  =2;
              expectedDiff=-1;
            }else{
                current=1;
                expectedDiff=1;
            }
            if(current>=2){
               max=Math.max(max,current) ;
            }
        }return max;
    }
}