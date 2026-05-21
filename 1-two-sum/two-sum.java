class Solution {
    public int[] twoSum(int[] nums, int target) {

//twosum
HashMap<Integer,Integer> map = new HashMap<>();
for(int i=0;i<nums.length;i++){
    int index=target-nums[i];
    if(map.containsKey(index)){
        return new int[]{map.get(index),i};
    }else{
        map.put(nums[i],i);
    }
}
throw new IllegalArgumentException("not match");
    }
}