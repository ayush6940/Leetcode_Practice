class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        long res=0;
        for(int i=0;i<n/2;i++){
            String one=String.valueOf(nums[i]);
            String two=String.valueOf(nums[n-i-1]);
            StringBuilder sb=new StringBuilder();
            sb.append(one);sb.append(two);
            res+=Integer.parseInt(sb.toString());
        }
        if(n%2==1){
            res+=nums[n/2];
        }
        return res;
    }
}