class Solution {
    public boolean exist(char[][] arr, String word) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(backTrack(arr,0,i,j,word)){return true;}
            }
        }
        return false;
    }
public boolean backTrack(char [][]arr,int index,int i,int j,String word){
    if(index==word.length()){return true;}
    if(i<0 || j<0 || i>=arr.length || j>=arr[0].length){return false;}
    if(word.charAt(index)!=arr[i][j]){return false;}
    
    char temp=arr[i][j];
    arr[i][j]='#';
    
boolean isFound=backTrack(arr,index+1,i+1,j,word) ||
                backTrack(arr,index+1,i-1,j,word) ||
                backTrack(arr,index+1,i,j+1,word) ||
                backTrack(arr,index+1,i,j-1,word);

    arr[i][j]=temp;
    return isFound;
}
}