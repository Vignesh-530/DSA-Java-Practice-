class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> dup= new HashMap<>();
       
        for(int num:nums){
            if(dup.containsKey(num)){
                return true;
            }
            dup.put(num,1);
        }
       return false;
}
}
