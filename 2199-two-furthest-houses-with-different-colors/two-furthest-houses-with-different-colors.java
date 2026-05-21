class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int max=0;
        int low=colors[0];

        for(int i=0;i<n-1;i++){
            
                if(colors[i]!=colors[n-1]){
                    int temp=n-1-i;
               max=Math.max(max,temp); 
            break;
           } }for(int i=n-1;i>=0;i--){
            if(colors[i]!=colors[n-1]){
                    int temp=n-1-i;
               max=Math.max(max,i); 
            break;

            }}
        return max;
    }
}