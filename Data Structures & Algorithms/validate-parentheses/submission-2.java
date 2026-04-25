class Solution {
    public boolean isValid(String s) {
       Stack<Character> myStack = new Stack<>();
       for(char c : s.toCharArray()){
        if(c == '(' || c == '[' || c == '{'){
            myStack.push(c);
        }
        else if(c==')' && !myStack.isEmpty() && myStack.peek() == '(')
        {
            myStack.pop();
        }
        else if(c==']' && !myStack.isEmpty() && myStack.peek() == '[')
        {
            myStack.pop();
        }
        else if(c=='}' && !myStack.isEmpty() && myStack.peek() == '{')
        {
            myStack.pop();
        }
        else{
            return false;
        }
       } 
       if(myStack.isEmpty()){
        return true;
       }
       return false;
    }
}
