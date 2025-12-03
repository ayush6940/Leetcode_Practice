class Solution {
    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }
    public String helper(String s){
        StringBuilder sb=new StringBuilder();
        if(s.length()>1){
            for(char c:s.toCharArray()){
                if(c=='#'){
                    if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
                }
                else{
                    sb.append(c);
                }
            }
        }
        if(s.length()<=1){return s;}
        return sb.toString();
    }
}