class Solution {
public static void helper(int i, int j, int n, String curr, int[][] vis, List<String>ans, int[][] grid){
    if(i == n-1 && j == n-1){
       ans.add(new String(curr));
       return; 
    }

    //Up
    if(i-1 >= 0 && grid[i-1][j] != 0 && vis[i-1][j] != 1 ){
        vis[i-1][j] = 1;
        helper(i-1, j, n, curr+'U', vis, ans, grid);
        vis[i-1][j] = 0;
    }
    //Down 
      if(i+1 <grid.length && grid[i+1][j] != 0 && vis[i+1][j] != 1 ){
        vis[i+1][j] = 1;
        helper(i+1, j, n, curr+'D', vis, ans, grid);
        vis[i+1][j] = 0;
    }
    //Left
      if(j-1 >= 0 && grid[i][j-1] != 0 && vis[i][j-1] != 1 ){
        vis[i][j-1] = 1;
        helper(i, j-1, n, curr+'L', vis, ans, grid);
        vis[i][j-1] = 0;
    }
    //Right
      if(j+1 < grid.length && grid[i][j+1] != 0 && vis[i][j+1] != 1 ){
        vis[i][j+1] = 1;
        helper(i, j+1, n, curr+'R', vis, ans, grid);
        vis[i][j+1] = 0;
    }
}

    public List<String> findPath(int[][] grid) {
        List<String>ans = new ArrayList<>();
        int n = grid.length;
        int[][] vis = new int[n][n];
for(int i=0; i<n; i++){
    Arrays.fill(vis[i], 0);
}
        if(grid[0][0] == 1) 
        {
            vis[0][0] = 1;
            helper(0,0,n, "", vis, ans, grid);
        }
        return ans;
    }
}
