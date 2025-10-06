class Solution {
public void helper(int[] nums, int idx, int currSum, List<Integer> ans){
  if(idx == nums.length){
    ans.add(currSum);
    return;
  }

  helper(nums, idx+1, currSum+nums[idx], ans);

  helper(nums, idx+1, currSum , ans);
}

    public List<Integer> subsetSums(int[] nums) {
    List<Integer> ans = new ArrayList<>();

    helper(nums, 0, 0, ans);
    Collections.sort(ans);
    return ans;
    }
}
