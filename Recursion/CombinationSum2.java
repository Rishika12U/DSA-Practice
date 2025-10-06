class Solution {
public static void helper(int[] candidates, int target , int idx, List<Integer>curr, List<List<Integer>> result){
    if(target == 0){
       result.add(new ArrayList<>(curr));
        return;
    }
    
    for(int i = idx; i<candidates.length; i++){
if( i > idx && candidates[i] == candidates[i-1]) continue;
if(candidates[i] > target) break;

  curr.add(candidates[i]);
    helper(candidates, target-candidates[i], i+1, curr, result);
    curr.remove(curr.size()-1);
    }

}

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, curr, result);
        return result;
    }
}
