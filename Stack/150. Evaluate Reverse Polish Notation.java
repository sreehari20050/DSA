class Solution {
    public boolean istoken(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    public int operate(String token , int a ,int b){
        switch (token){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }
        return 0;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String token : tokens){
            if(istoken(token)){
                int b = s.pop();
                int a = s.pop();
                int sum = operate(token,a,b);
                s.push(sum);
            }
            else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}
