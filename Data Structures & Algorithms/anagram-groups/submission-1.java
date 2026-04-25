class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ret = new HashMap<>();
        int[] counter = new int[26];
        String counterStr ="";
        List<String> tmp;
        for(String s : strs){
            counter = new int[26];
            for(int i = 0; i < s.length(); i++){
                counter[s.charAt(i)-'a']++;
            }
            counterStr = Arrays.toString(counter);
            if(ret.containsKey(counterStr)){
                tmp = ret.get(counterStr);
                tmp.add(s);
                ret.put(counterStr,tmp);
            }
            else{
                tmp = new ArrayList<>();
                tmp.add(s);
                ret.put(counterStr,tmp);
            }
        }
        return new ArrayList<>(ret.values());
    }
}
