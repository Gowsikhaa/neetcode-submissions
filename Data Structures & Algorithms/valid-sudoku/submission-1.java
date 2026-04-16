class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> mySetR = new HashSet<>();
        Set<Character> mySetC = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            mySetR = new HashSet<>();
            mySetC = new HashSet<>();
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    if(mySetR.contains(board[i][j])){
                        return false;
                    }
                    mySetR.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    if(mySetC.contains(board[j][i])){
                        return false;
                    }
                    mySetC.add(board[j][i]);
                }
            }
        }
        Set<Character> mySetg = new HashSet<>();
        int count = 0;
        int r = 0, c = 0;
        while(count<9){
            mySetg = new HashSet<>();
            for(int i = r; i < r+3; i++){
                for(int j = c; j < c+3; j++){
                    if(board[i][j] != '.'){
                        if(mySetg.contains(board[i][j])){
                            return false;
                        }
                        mySetg.add(board[i][j]);
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
