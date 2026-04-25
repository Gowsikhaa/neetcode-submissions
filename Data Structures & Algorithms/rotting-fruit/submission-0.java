class Solution {
    Queue<int[]> q;
    public int orangesRotting(int[][] grid) {
        int min=0;
        q = new LinkedList<>();
        for(int r = 0; r< grid.length; r++){
            for(int c = 0; c<grid[0].length; c++){
                if(grid[r][c] == 2){
                    q.add(new int[]{r,c});
                }
            }
        }
        if(!q.isEmpty()){
           min = performBFS(grid,q, min);
        }
        for(int r = 0; r< grid.length; r++){
            for(int c = 0; c<grid[0].length; c++){
                if(grid[r][c] == 1){
                   return -1;
                }
            }
        }
        return min;
    }

    public int performBFS(int[][] grid, Queue<int[]> q, int min){
        Queue<int[]> newq = new LinkedList<>();
        List<int[]> dir = new ArrayList<>();
        dir.add(new int[]{0,1});
        dir.add(new int[]{1,0});
        dir.add(new int[]{-1,0});
        dir.add(new int[]{0,-1});
        for(int[] g : q){
            for(int [] d: dir){
                int r = g[0]+d[0];
                int c = g[1]+d[1];
                if(r>=0 && c >=0 && 
                r < grid.length && c < grid[0].length && 
                grid[r][c] == 1){
                    grid[r][c] = 2;
                    newq.add(new int[]{r,c});
                }
            }
        }
        if(!newq.isEmpty()){
            min++;
            min = performBFS(grid, newq, min);
        }
        return min;
    }
}
