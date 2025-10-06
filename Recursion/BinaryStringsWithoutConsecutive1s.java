class Solution {
public List<String> helper(int n, String curr, List<String>result){
    if(curr.length() == n){
        result.add(curr);
        return result;
    }
    helper(n, curr+'0' , result);

    if(curr.isEmpty() || curr.charAt(curr.length()-1) != '1'){
      helper(n, curr+'1', result);
    }
    return result;
}

    public List<String> generateBinaryStrings(int n) {
        List<String>result = new ArrayList<>();
        return helper(n, "", result);
    }
}
