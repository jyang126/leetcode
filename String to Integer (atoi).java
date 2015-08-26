public class Solution {
    public int myAtoi(String str) {
        str=str.trim();
        if (str.length()==0)
            return 0;
        int index=0;
        int sign=1;
        if (str.charAt(index)=='+')
            index++;
        else if (str.charAt(index)=='-') {
            index++;
            sign=-1;
        }
        long rst=0;
        for (;index<str.length();index++) {
            if (str.charAt(index)<'0'||str.charAt(index)>'9')
                break;
            rst=rst*10+(str.charAt(index)-'0');
            if (rst>Integer.MAX_VALUE)
                break;
        }
        long result=rst*sign;
        if (result<=Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if (result>=Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)result;
    }
}
