class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> dist = new HashSet<>();
        for(int num : nums){
            dist.add(num);
        }
        Set<Integer> seq = new HashSet<>();
        int count = 0, max = 0;
        for(int num : dist){
            if(!dist.contains(num-1))
            {
                seq.add(num);
            }
        }
        for(int num : seq){
            while(dist.contains(num++)){
                count++;
            }
            max = Math.max(max,count);
            count = 0;
        }
        return max;
    }
}
