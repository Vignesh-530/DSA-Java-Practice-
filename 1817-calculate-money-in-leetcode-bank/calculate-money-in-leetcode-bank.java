class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int monday=1;
        while(n>0){
            int money=monday;
            for(int day=0;day<7 && n>0;day++){
                sum+=money;
                money++;
                n--;


            }
            monday++;
        }
        return sum;
    }
}