class Solution {
    public int removeDuplicates(int[] arr) {
Set<Integer>set= new LinkedHashSet<>();
//to remove duplicates
for(int num:arr){
    set.add(num);

}
//to print the unique values
int i=0;
for(int num:set){
    arr[i++]=num;
}
return i;


    }
}