public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        if (x==0)
            return true;
        int n=1;
        while (x/n>=10){
            n=n*10;
        }
        while (x!=0){
            int high=x/n;
            int low=x%10;
            if (high!=low)
                return false;
            x=x%n;
            x=x/10;
            n=n/100;
        }
        return true;
    }
}
