public class Solution {
    public String intToRoman(int num) {
        int[] int_dict = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] roman_dict = { "M", "CM", "D", "CD", "C", "XC", "L", "XL",
				"X", "IX", "V", "IV", "I" };
		String result="";
		int i=0;
		while (num>0){
		    if (num-int_dict[i]>=0){
		    num-=int_dict[i];
		    result+=roman_dict[i];
		    }
		    else
		    i++;
		}
		return result;
    }
}
