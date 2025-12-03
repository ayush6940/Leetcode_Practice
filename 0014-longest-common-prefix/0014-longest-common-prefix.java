class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){return strs[0];}
        StringBuilder sb=new StringBuilder();
        String a=strs[0];String b=strs[1];
        int n=a.length();int q=b.length();int i=0;int j=0;
        while(i<a.length() && i<b.length()){
          if(a.charAt(i)==b.charAt(i)){
            sb.append(a.charAt(i));
          }
          else{
            break;
          }
          i++;
        }
        for(int z=0;z<strs.length;z++){
            if(strs[z].startsWith(sb.toString())){
                continue;
            }
            else{
                sb.deleteCharAt(sb.length()-1);
                z--;
            }
        }
        return sb.toString();
    }
}