class Solution {
    public static int prec(char ch){
        switch (ch){
            case '+':
            case '-':
            return 1;

            case '*':
            case '/':
            return 2;

            case '^':return 3;
        }
        return -1;
    }
    public String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                result += ch;
            }
            else if(ch == '('){
             stack.push(ch);
            }
            else if(ch == ')'){
                while(!stack.isEmpty () && stack.peek() != '('){
                    result += stack.pop();
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && prec(ch) <= prec(stack.peek())){
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }
           while (!stack.isEmpty()) {
        result += stack.pop();
    }
        return result;
    }
}
