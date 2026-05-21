import java.util.HashMap;

class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int maxDigit = getMaxDigit(num);

            if (map.containsKey(maxDigit)) {
                
                maxSum = Math.max(maxSum, map.get(maxDigit) + num);
          
                map.put(maxDigit, Math.max(map.get(maxDigit), num));
            } else {
            
                map.put(maxDigit, num);
            }
        }

        return maxSum;
    }

    private int getMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            maxDigit = Math.max(maxDigit, num % 10); 
            num /= 10; 
        }
        return maxDigit;
    }
}
