class Solution {
    public int majorityElement(int[] nums) {
        int a=nums.length/2;int curr=1;int max=0;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}