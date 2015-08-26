public class Solution {
    public boolean isMatch(String s, String p) {
        if (s==null||p==null)
            return false;
        return helper(s,p,0,0);
    }
    public boolean helper(String s, String p, int sindex, int pindex) {
        int slen=s.length();
        int plen=p.length();
        if (pindex==plen)
            return sindex==slen;
        if (pindex+1==plen)
            return sindex+1==slen&&matchchar(s,p,sindex,pindex);
        if (p.charAt(pindex+1)!='*') {
            if (sindex<slen&&matchchar(s,p,sindex,pindex))
                return helper(s,p,sindex+1,pindex+1);
            else
                return false;
        }
        if (helper(s,p,sindex,pindex+2))
            return true;
        for (int i=sindex;i<slen;i++) {
            if (!matchchar(s,p,i,pindex))
                return false;
            else {
                if (helper(s,p,i+1,pindex+2))
                    return true;
            }
        }
        return false;
    }
    public boolean matchchar(String s, String p, int sindex, int pindex) {
        return s.charAt(sindex)==p.charAt(pindex)||p.charAt(pindex)=='.';
    }
}
