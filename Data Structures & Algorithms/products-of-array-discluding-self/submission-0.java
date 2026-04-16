class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 1,2,4,6
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] ret = new int[nums.length];
        // 1,1,2,8
        for(int i = 0; i < nums.length; i++){
            if(i==0){
                prefix[i] =1;
                continue;
            }
            prefix[i] = nums[i-1] * prefix[i-1];
        }
        // 48,24,6,1
        for(int i = nums.length-1; i >=0; i--){
            if(i==nums.length-1){
                suffix[i] =1;
                continue;
            }
            suffix[i] = nums[i+1] * suffix[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                ret[i] = suffix[i];
            }
            else if(i == nums.length-1){
                ret[i] = prefix[i];
            }
            else{
                ret[i] = prefix[i] * suffix[i];
            }
        }
        return ret;
    }
}  
