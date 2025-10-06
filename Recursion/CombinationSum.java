class Solution {
public static void helper(int[] candidates, int target , int idx, List<Integer>curr, List<List<Integer>> result){
    if(target == 0){
        result.add(new ArrayList<>(curr));
        return;
    }
    if(target < 0 || idx == candidates.length)return;

    curr.add(candidates[idx]);
    helper(candidates, target-candidates[idx], idx, curr, result);
    curr.remove(curr.size()-1);

        helper(candidates, target, idx+1, curr, result);

}

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(candidates, target, 0, curr, result);
        return result;
    }
}
