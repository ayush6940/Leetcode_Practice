class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        if(arr.length==1){return null;}
        List<List<Integer>>res=new ArrayList<>();
        helper(res,arr);
        return res;
    }
public void helper(List<List<Integer>>ans,int arr[]){
       Arrays.sort(arr);int mindiff=Integer.MAX_VALUE;
       for(int i=1;i<arr.length;i++){
         mindiff=Math.min(mindiff,arr[i]-arr[i-1]);
       }
       
       for(int i=1;i<arr.length;i++){
        if(arr[i]-arr[i-1]==mindiff){
            List<Integer>small=new ArrayList<>();
            small.add(arr[i-1]);
            small.add(arr[i]);
            ans.add(small);
        }
       }
    }
}