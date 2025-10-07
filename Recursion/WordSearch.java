class Solution {
public boolean helper(char[][] board, String word, int i, int j, int idx, int m, int n){
 if(idx == word.length())return true;

 if(i == m || j==n || i< 0 || j<0 || word.charAt(idx) != board[i][j] || board[i][j] == '!')return false;

 char c = board[i][j];
 board[i][j] = '!';

 boolean left = helper(board, word, i-1, j, idx+1, m, n);
 boolean right = helper(board, word, i+1, j, idx+1, m, n);
 boolean top = helper(board, word, i, j+1, idx+1, m, n);
 boolean down = helper(board, word, i, j-1, idx+1, m, n);;

 board[i][j] = c;

 return left||right||top||down;
}

    public boolean exist(char[][] board, String word) {
       int m = board.length;
       int n = board[0].length;
       int idx=0;

       for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(word.charAt(idx) == board[i][j]){
                if(helper(board, word, i, j, idx, m, n)){
                    return true;
                }
            }
        }
       }
       return false;
    }
}
