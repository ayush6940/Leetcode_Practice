class Solution {
    public int strStr(String a1, String a2) {
        int a=a1.length();int b=a2.length();
        for(int i=0;i<=a-b;i++){
            if(a1.substring(i,i+b).equals(a2)){
                return i;
            }
        }
        return -1;
    }
}