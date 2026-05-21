class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int duplicate=-1;
        
        for(int num:nums){
            if(hs.contains(num)){
                duplicate=num;
                break;
            }
            hs.add(num);
        }
        return duplicate;
        
    }
}