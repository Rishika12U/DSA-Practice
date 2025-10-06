class Solution {
public static void helper(List<Integer>curr, List<List<Integer>> result, int[] nums, int i){
    result.add(new ArrayList<>(curr));
if(curr.size() == nums.length){
return;
}
for(int j = i; j<nums.length; j++){
    curr.add(nums[j]);
    helper(curr, result, nums, j+1);
    curr.remove(curr.size()-1);
}
}

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(curr,result, nums, 0);
        return result;
    }
}
