class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(myMap.containsKey(target-nums[i])){
                int[] ret = new int[2];
                ret[0]=myMap.get(target-nums[i]);
                ret[1]=i;
                return ret;
            }
            else{
                myMap.put(nums[i],i);
            }
        }
        return null;
    }
}
