class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1){
            return intervals;
        }
        Arrays.sort(intervals, (a,b) ->{
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int len = merged.size()-1;
            if(i == 0){
                merged.add(new int[]{start, end});
                continue;
            }
            int prevS = merged.get(len)[0];
            int prevE =  merged.get(len)[1];
            if(prevE >= start){
                merged.set(len, new int[]{prevS, Math.max(end,prevE)});
            }
            else{
                merged.add(new int[] {start,end});
            }
        }  
        return merged.toArray(new int [merged.size()][]);
    }
}
