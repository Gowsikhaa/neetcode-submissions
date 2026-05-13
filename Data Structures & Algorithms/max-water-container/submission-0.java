class Solution {
    public int maxArea(int[] heights) {
        int start = 0, end = heights.length-1, max = 0;

        while (start<end){
            max = Math.max(max, Math.min(heights[start], heights[end]) * (end-start));
            if(heights[start] > heights[end]){
                end--;
            }
            else if(heights[start] < heights[end]){
                start++;
            }
            else{
                start++;
                end--;
            }
        }
        return max;
    }
}
