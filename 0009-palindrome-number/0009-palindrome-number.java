class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        return x==reverse(x);
    }
    public int reverse(int x){
        int a=0;
        while(x!=0){
            int r=x%10;
            a=(a*10)+r;
            x/=10;
        }
        return a;
    }
}