class Solution {
    public int longestValidParentheses(String s) {
        if(s == null || s.length() == 0) return 0;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    result = Math.max(result, i - stack.peek());
                }

            }
        }
        return result;
    }
}
