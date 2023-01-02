import java.util.Stack;

// Link- https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
public class Evaluate_Reverse_Polish_Notation {

    //TC- O(n)
    //SC- O(n) as we are storing tokens in stack
    // We will use stack here as for every arithmetic operator, we have to operate it on previous 2 operands
    class Solution {
        public int evalRPN(String[] tokens) {

            Stack<Integer> stack = new Stack<>();

            for (String s : tokens) {

                if ("+".equals(s)) stack.push(stack.pop() + stack.pop());

                else if ("-".equals(s)) stack.push(-stack.pop() + stack.pop());

                else if ("/".equals(s)) stack.push((int)(1D / stack.pop() * stack.pop()));

                else if ("*".equals(s)) stack.push(stack.pop() * stack.pop());

                else stack.push(Integer.valueOf(s));

            }

            return stack.pop();
        }
    }

}
