class Solution {
public static void backtrack(String curr, int open, int close,int n, List<String>result){
    if(curr.length() == 2*n){
        result.add(curr);
        return;
    }
    if(open < n) backtrack(curr+'(', open+1, close, n,result);
    if(close < open)backtrack(curr+')', open,  close+1,n, result);
}

    public List<String> generateParenthesis(int n) {
        List<String>result = new ArrayList<>();
        backtrack("", 0, 0, n, result);
        return result;
    }
}
