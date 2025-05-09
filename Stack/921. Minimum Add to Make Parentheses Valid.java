class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int left = 0;
        for (char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
            else{
                left++;
            }
        }
        return left + stack.size();
    }
}
