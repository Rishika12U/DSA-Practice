class Solution {
public int count(int[] nums,  int k, int ind){
  if( k == 0)return 1;

  if(k < 0 || ind == nums.length)return 0;

  return count(nums, k-nums[ind], ind+1)+count(nums, k, ind+1);
}

    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return count(nums, k, 0);
    }
}
