class LongestValidParenthesis{
  public static int longestValidParenthesis(String s) {
    
    int maxLength = 0;
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);
    
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            stack.push(i);
        } else {
            stack.pop();
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                maxLength = Math.max(maxLength, i - stack.peek());
            }
        }
    }
    
    return maxLength;
  }

  public static void main(String[] args) {
    System.out.println(longestValidParenthesis("(()"));
  }
}