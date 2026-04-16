class Solution {
    public boolean isPalindrome(String s) {
        s  = s.toLowerCase();
        int start=0,end = s.length()-1;
        while(start<end){
            if(isNonChar(s.charAt(start))){
                start++;
                continue;
            }
            if(isNonChar(s.charAt(end))){
                end--;
                continue;
            }
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        } 
        return true;
    }

    public boolean isNonChar(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c<= 'Z') || (c >= '0' && c <= '9')){
            return false;
        }
        return true;
    }
}
