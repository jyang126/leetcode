public class Solution {
    public int maxArea(int[] height) {
        if (height==null||height.length==0)
            return 0;
        int start=0;
        int end=height.length-1;
        int max=Integer.MIN_VALUE;
        while (start<end){
            int area=Math.min(height[start],height[end])*(end-start);
            max=Math.max(area,max);
            if (height[start]<=height[end])
            start++;
            else
            end--;
        }
        return max;
    }
}
