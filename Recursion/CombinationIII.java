class Solution {
public static void helper(int k, int n,int start, List<Integer>curr, List<List<Integer>>result){
    if(curr.size() == k && n == 0){
        result.add(new ArrayList<>(curr));
        return;
    }
    if(n <= 0 || curr.size() >= k)return;
    for(int i=start; i<=9; i++){
    if(i<=n){
        curr.add(i);
    helper(k, n-i, i+1, curr, result);
    curr.remove(curr.size()-1);
    }else{
        break;
    }
    }
}

    public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>>result = new ArrayList<>();
      List<Integer>curr = new ArrayList<>();
      helper(k, n, 1, curr, result);
      return result;  
    }
}
