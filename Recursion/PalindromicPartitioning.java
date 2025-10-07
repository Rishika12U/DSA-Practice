class Solution {
public void helper(String s, List<String>curr, int idx, List<List<String>>result){
    if(idx == s.length()){
        result.add(new ArrayList<>(curr));
        return;
    }
    for(int i=idx; i<s.length(); i++){
        if(isPalindrome(s, idx, i)){
            curr.add(s.substring(idx, i+1));
            helper(s, curr, i+1, result);
            curr.remove(curr.size()-1);
        }
    }
}

public boolean isPalindrome(String s, int start, int end){
while(start <= end){
    if(s.charAt(start) != s.charAt(end)){
        return false;
    }
    start++;
    end--;
}
return true;
}

    public List<List<String>> partition(String s) {
        List<List<String>>result = new ArrayList<>();
        List<String>curr = new ArrayList<>();

        helper(s, curr, 0, result);
        return result;
    }
}
