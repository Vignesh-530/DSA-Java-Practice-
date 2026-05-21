class Solution {

    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> patel = new HashMap<>();

        int ans = 0;

       
        for(int i = 0; i < nums.length; i++) {

            if(patel.containsKey(nums[i])) {

                patel.put(nums[i], patel.get(nums[i]) + 1);

            } else {

                patel.put(nums[i], 1);
            }
        }

        
        for(int bunny : patel.keySet()) {

            int val = patel.get(bunny);

            ans = ans + (val * (val - 1)) / 2;
        }

        return ans;
    }
}