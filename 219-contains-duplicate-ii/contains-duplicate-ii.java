class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>duplicate=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(duplicate.containsKey(num)){
                int previndex=duplicate.get(num);
                
                if(i-previndex<=k){
                    return true;
                }
            }
                duplicate.put(num,i);
            
        }
        return false;
            }
        }
        
    
