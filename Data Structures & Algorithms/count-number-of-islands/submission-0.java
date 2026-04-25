class Solution {
    List<int[]> arr;
    public int numIslands(char[][] grid) {
        int count = 0;
        arr = new ArrayList<>();
        arr.add(new int[]{0,1});
       arr.add(new int[]{1,0});
       arr.add(new int[]{0,-1});
       arr.add(new int[]{-1,0});
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    performDFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void performDFS(char[][] grid, int i,int j){
       if(grid[i][j] == '1'){
           grid[i][j] = '0';
       }
       for(int[] tmp : arr){
        int r = i+tmp[0];
        int c = j+tmp[1];
          if(r >= 0 && c >= 0 && 
         r < grid.length && c < grid[0].length &&
         grid[r][c] == '1'){
         performDFS(grid, r, c);
         }
       }
    }
}
