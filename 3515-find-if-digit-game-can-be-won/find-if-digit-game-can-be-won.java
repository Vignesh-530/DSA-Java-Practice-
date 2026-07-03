class Solution {
    public boolean canAliceWin(int[] nums) {
          
        int singleDigitsum=0;
        int doubleDigitsum=0;
        for(int num:nums){
           if(num>0&&num<=9){
            
       singleDigitsum+=num;
       
    }
    else if(num>9&&num<=99){
        doubleDigitsum+=num;
    }
    
      

}
if(singleDigitsum>doubleDigitsum||singleDigitsum<doubleDigitsum){
        return true;
        }else
            return false;
        
        
    }
}