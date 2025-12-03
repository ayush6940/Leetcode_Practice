class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>hash=new HashSet<>();
        while(!hash.contains(n)){
            hash.add(n);
            n=productOfSquare(n);
            if(n==1){return true;}
        }
        return false;
    }
    public int productOfSquare(int n){
        int ans=0;
        while(n>0){
         int r=n%10;
         ans+=r*r;
         n/=10;
        }
        return ans;
    }
}