class Solution {
    public static void helper(int[] nums, int idx, List<Integer>curr, List<List<Integer>>result){
      result.add(new ArrayList<>(curr));
       for(int i = idx ; i< nums.length; i++){
        if(i>idx && nums[i] == nums[i-1])continue;

         curr.add(nums[i]);
            helper(nums, i+1, curr, result);
            curr.remove(curr.size()-1);
       }
        
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>curr = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, 0, curr, result);
        return result;
    }
}
