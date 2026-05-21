class Solution {
    public int largestAltitude(int[] gain) {
       
        int start=0;
        int maxaltitude=0;
        for(int i=0;i<gain.length;i++){
            start+=gain[i];

            maxaltitude=Math.max(maxaltitude,start);
            
        }
        return maxaltitude; 
    }
}