class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int duplicate=-1;
        int missing=-1;
        
                for(int num:nums){
                    if(hs.contains(num)){
                        duplicate=num;
                    }
                    hs.add(num);
                }
                for(int i=1;i<=nums.length;i++)
            {
                if(!hs.contains(i)){
                    missing=i;
                    break;
                }
            }
        return new  int[] {duplicate , missing};
    }
}