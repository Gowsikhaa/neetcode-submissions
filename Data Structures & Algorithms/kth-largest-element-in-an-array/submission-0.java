class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> kTracker = new PriorityQueue<>();
        for(int num : nums){
            if(kTracker.size()==k && kTracker.peek()<num){
                kTracker.poll();
                kTracker.add(num);
                continue;
            }
            if(kTracker.size()<k){
                kTracker.add(num);
            }
        }
        return kTracker.peek();
    }
}
