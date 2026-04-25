/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a,b) ->{
            if(a.start == b.start){
               return a.end - b.end;
            }
            return a.start - b.start;
        });
        int count = 0;
        int i = 0; 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Interval cur : intervals){
            if(pq.size()==0){
               pq.add(cur.end);
            }
            else if(pq.peek() <= cur.start){
                pq.poll();
                pq.add(cur.end);
            }
            else{
                pq.add(cur.end);
            }
            count = Math.max(count, pq.size());
        }
        return count;
    }
}
