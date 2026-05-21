class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int FirstDigit=getFirstDigit(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                int LastDigit=nums[j]%10;
                if(gcd(FirstDigit,LastDigit)==1){
                    count++;
                }
            }
        }return count;
      }  
      private int getFirstDigit(int num){
        while(num>=10){
           num /=10; 
        }return num;
      }
      private int gcd(int a ,int b){
        if(b==0)return a;
      return gcd(b,a%b);
      }

        
    
}