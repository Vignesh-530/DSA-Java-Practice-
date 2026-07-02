class Solution {
    public int[] findEvenNumbers(int[] digits) {

        Set<Integer>set= new TreeSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(digits[i]==0){
                        continue;
                    }
if(i==j||j==k||k==i){
    continue;
}
                    int result = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if(digits[k]%2==0){
                      set.add(result);
                    }
                    
                }
            }
        }
       
        int[]ans= new int[set.size()];
        int index=0;
        for(int num:set){
ans[index]=num;
index++;
        }
      
return ans;
        
    }
}