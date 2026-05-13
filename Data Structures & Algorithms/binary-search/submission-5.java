class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1, mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[start] == target){
                return start;
            }
            else if(nums[end] == target){
                return end;
            }
            else if(nums[mid] == target){
                return mid;
            }
            else{
                if(target < mid){
                    end = mid-1;
                    start++;
                }
                else{
                    start = mid+1;
                    end--;
                }
            }
        }
        return -1;
    }
}
