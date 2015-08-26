public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        if (len%2==0)
            return (findkth(nums1,0,nums2,0,len/2)+findkth(nums1,0,nums2,0,len/2+1))/2.0;
        else
            return findkth(nums1,0,nums2,0,len/2+1);
    }
    public double findkth(int[] a, int a_start, int[] b, int b_start, int k){
        if (a_start>=a.length)
            return b[b_start+k-1];
        if (b_start>=b.length)
            return a[a_start+k-1];
        if (k==1)
            return Math.min(a[a_start],b[b_start]);
        int a_key=a_start+k/2-1<a.length?a[a_start+k/2-1]:Integer.MAX_VALUE;
        int b_key=b_start+k/2-1<b.length?b[b_start+k/2-1]:Integer.MAX_VALUE;
        if (a_key<b_key) {
            return findkth(a,a_start+k/2,b,b_start,k-k/2);
        }
        else
            return findkth(a,a_start,b,b_start+k/2,k-k/2);
    }
}
