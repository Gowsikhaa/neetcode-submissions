class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> mySet = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            mySet = new HashSet<>();
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    if(mySet.contains(board[i][j])){
                        return false;
                    }
                    mySet.add(board[i][j]);
                }
            }
        }
        for(int i = 0; i < board.length; i++){
            mySet = new HashSet<>();
            for(int j = 0; j < board[0].length; j++){
                if(board[j][i] != '.'){
                    if(mySet.contains(board[j][i])){
                        return false;
                    }
                    mySet.add(board[j][i]);
                }
            }
        }
        int count = 0;
        int r = 0, c = 0;
        while(count<9){
            mySet = new HashSet<>();
            for(int i = r; i < r+3; i++){
                for(int j = c; j < c+3; j++){
                    if(board[i][j] != '.'){
                        if(mySet.contains(board[i][j])){
                            return false;
                        }
                        mySet.add(board[i][j]);
                    }
                }
            }
            count++;
            c = c+3;
            if(c == 9){
                c = 0;
                r = r+3;
            }
        }
        return true;
    }
}
