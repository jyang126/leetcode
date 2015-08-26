public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0)
            return "";
        if (strs.length==1)
            return strs[0];
        int len=strs.length;
        int n=0;
        int minleng=Integer.MAX_VALUE;
        for (int k=0;k<len;k++){
            if (strs[k].length()==0)
                return "";
            else if (minleng>strs[k].length()) {
             minleng=strs[k].length();
             n=k;
            }
        }
        for (int index=0;index<minleng;index++){
            char curr=strs[n].charAt(index);
            for (int j=0;j<len;j++){
                if (strs[j].charAt(index)!=curr){
                    if (index==0){
                        return "";
                    }
                    else {
                        return strs[n].substring(0,index);
                    }
                }
            }
        }
        return strs[n];
    }
}
