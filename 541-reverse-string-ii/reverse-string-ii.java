class Solution {
    public String reverseStr(String s, int k) {
         char []arr=s.toCharArray();
         for(int left=0;left<arr.length;left+=2*k){
          int right=Math.min(left+k-1,arr.length-1);
int i=left;
int j=right;
while(i<j){
    char temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}



         }

return new String(arr);
    }
}