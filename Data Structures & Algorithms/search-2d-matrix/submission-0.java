class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0, end = (matrix.length * matrix[0].length) -1, mid = 0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(target == getV(mid,matrix) || target == getV(start,matrix) || target == getV(end,matrix)){
                return true;
            }
            else{
                if(target > getV(mid,matrix)){
                    start = mid+1;
                    end--;
                }
                else{
                    end = mid-1;
                    start++;
                }
            }
        }
        return false;
    }

    private int getV(int index, int[][] matrix){
        int r = 0, c = 0;
        if(index > 0){
            r = index/matrix[0].length;
            c = index % matrix[0].length;
        }
        return matrix[r][c];
    }
}
