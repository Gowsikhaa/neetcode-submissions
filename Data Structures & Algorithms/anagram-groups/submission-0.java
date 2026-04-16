class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] myKey = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                myKey[strs[i].charAt(j) - 'a']++;
            }
           String myKeyStr =  Arrays.toString(myKey);
            if(myMap.containsKey(myKeyStr)){
                List<String> str = myMap.get(myKeyStr);
                str.add(strs[i]);
                myMap.put(myKeyStr, str);
            }
            else{
                List<String> str = new ArrayList<>();
                str.add(strs[i]);
                myMap.put(myKeyStr, str);
            }
        }
        List<List<String>>  retList = new ArrayList<>();
        for(List<String> strList :  myMap.values()){
            retList.add(strList);
        }
        return retList;
    }
}
