class Solution {
    public int diagonalPrime(int[][] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i][i])){
               res=Math.max(res,nums[i][i]);
            }
            if(isPrime(nums[i][nums.length-i-1])){
               res=Math.max(res,nums[i][nums.length-i-1]);
            }
        }
         return res;
    }
    public boolean isPrime(int n){
        if(n<=1){return false;}
        if(n==2 || n==3 || n==5 || n==7){return true;}
        if(n%2==0 || n%3==0 || n%5==0 || n%7==0){return false;}
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}