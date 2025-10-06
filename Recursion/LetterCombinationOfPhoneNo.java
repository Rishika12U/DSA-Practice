class Solution {

    public static String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

public static void helper(String digits, int idx, String temp, List<String>ans){
    if(temp.length() == digits.length()){
        ans.add(temp);
        return;
    }
String str = map[digits.charAt(idx)-'0'];

for(int i=0; i<str.length(); i++){
    
    helper(digits, idx+1, temp+str.charAt(i), ans);
}
}

    public List<String> letterCombinations(String digits) {
        List<String>ans = new ArrayList<>();
        String temp = "";
        if(digits.length() == 0)return ans;
        helper(digits, 0, temp, ans );
        return ans;
    }
}
