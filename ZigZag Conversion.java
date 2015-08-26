public class Solution {
    public String convert(String s, int numRows) {
        StringBuilder res=new StringBuilder();
        if (s==null||s.length()==0)
            return res.toString();
        if (numRows>=s.length()||numRows==1)
            return s;
        int step=2*numRows-2;
        for (int i=0;i<numRows;i++){
            for (int j=i;j<s.length();j+=step) {
                res.append(s.charAt(j));
                if (i!=0&&i!=numRows-1&&j+step-2*i<s.length())
                    res.append(s.charAt(j+step-2*i));
            }
        }
        return res.toString();
    }
}
