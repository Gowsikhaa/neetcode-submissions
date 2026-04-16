class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int num : nums){
            myMap.put(num, myMap.getOrDefault(num,0)+1);
        }
        int n = myMap.size();
        List<Integer>[] count = new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> curVal : myMap.entrySet()){
             if(count[curVal.getValue()] == null)
             {
                count[curVal.getValue()] = new ArrayList<>();
             }
             count[curVal.getValue()].add(curVal.getKey());
        }
        
        int[] ret = new int[k];
        int c = 0;
        for(int i = count.length-1; i > 0; i--){
            if(count[i] == null){
                continue;
            }
            if(c == k){
                break;
            }
            for(int j : count[i]){
                ret[c] = j;
                c++;
            }
        }
        return ret;
    }
}
