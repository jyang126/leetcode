public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length<3) 
            return res;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++) {
            if (i==0 || nums[i]>nums[i-1]) { //avoid duplicate solutions   
                int j=i+1,k=nums.length-1;
                while (j<k) { 
                    if (nums[j]+nums[k]==-nums[i]) {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        res.add(temp);
                        k--;
                        j++;
                        while(k>j && nums[k]==nums[k+1]) k--;//avoid duplicate solutions 
                        while(j<k && nums[j]==nums[j-1]) j++;//avoid duplicate solutions 
                    } else if (nums[j]+nums[k]>-nums[i]) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
