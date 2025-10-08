class Solution {
public static boolean canPlace(char[][] board, int row, int col){
  for(int i = row-1; i>=0; i--){
    if(board[i][col] == 'Q'){
        return false;
    }
  }
  for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
    if(board[i][j] == 'Q'){
        return false;
    }
  }
  for(int i= row-1, j= col+1; i>=0 && j<board.length; i--, j++){
    if(board[i][j] == 'Q'){
        return false;
    }
  }
  return true;
}

public static void nQueenHelper(char[][] board , int row, List<List<String>>result){

      if(row == board.length){
        List<String>temp = new ArrayList<>();
    for(int i=0; i<board.length; i++){
        temp.add(new String(board[i]));
    }
        result.add(new ArrayList<>(temp));
        return;
      }

      for(int j = 0; j<board.length; j++){
        if(canPlace(board, row, j)){
        board[row][j] = 'Q';
        nQueenHelper(board, row+1, result);
        board[row][j] = '.';
        } 
      }
}

    public List<List<String>> solveNQueens(int n) {
      List<List<String>>result = new ArrayList<>();
      char[][] board = new char[n][n];
      for(int i=0; i<n; i++){
        Arrays.fill(board[i] , '.');
      }
      
     nQueenHelper(board, 0, result);
     return result;

    }
}
