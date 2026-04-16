class Solution {
    private char delimit = '#';

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append(delimit);
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    // 5#Hello5#World
    public List<String> decode(String str) {
        List<String> ret = new ArrayList<>();
        int i = 0, j = 0;
        while(i < str.length()){
            j = i;
           while(str.charAt(j)!= delimit){
                j++;
           }
           int count = Integer.parseInt(str.substring(i,j));
           i = j+1;
           j = j+count+1;
           System.out.println(str.substring(i,j));
           ret.add(str.substring(i,j));
           i = j;
        }
        return ret;
    }
}
