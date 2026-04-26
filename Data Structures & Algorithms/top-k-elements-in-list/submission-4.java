class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        System.out.println(freqMap);
        PriorityQueue<Integer> topK = new PriorityQueue<>((a,b) -> freqMap.get(a) - freqMap.get(b));
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(topK.size() == k && freqMap.get(topK.peek()) <  entry.getValue()){
                System.out.println("remove: " +topK.poll() + " add: " + entry.getKey());
                topK.add(entry.getKey());
            }
            else if(topK.size() < k){
                topK.add(entry.getKey());
            }
        }
        int[] ret = new int[k];
        for(int i = 0; i <k ; i++){
            ret[i]=topK.poll();
        }
        return ret;
    }
}
