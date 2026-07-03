class Solution {
    public int findGCD(int[] nums) {
         int smallest=nums[0];
      int largest=nums[0];
     
      for(int num:nums){
          if(num<smallest){
              smallest=num;
          }else if(num>largest){
              largest=num;
          }
      }
       int a=smallest;
      int b=largest;
    while(b!=0){
          int temp=b;
          b=a%b;
          a=temp;
      }
      return a;
        }
    }
