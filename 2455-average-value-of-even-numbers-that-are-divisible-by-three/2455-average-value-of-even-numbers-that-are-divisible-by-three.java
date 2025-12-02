class Solution {
    public int averageValue(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            if(i%3==0 && i%2==0){
                list.add(i);
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        if(list.size()==0){return 0;}
        return sum/list.size();
    }
}