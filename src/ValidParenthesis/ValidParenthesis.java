package ValidParenthesis;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        if (s.isEmpty())
            return true;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int currentChar = s.charAt(i);
            if (currentChar == '[' || currentChar == '{' || currentChar == '(') {
                stack.push(currentChar);
            } else if (currentChar == ']' || currentChar == '}' || currentChar == ')') {
                if (stack.isEmpty())
                    return false;

                if (currentChar == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

                if (currentChar == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

                if (currentChar == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

}

// Alternate Solution........................................................
// Stack<Character> stack = new Stack<>();

// for (char c : s.toCharArray()) {
// if (c == '(' || c == '{' || c == '[') {
// stack.push(c);
// } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
// stack.pop();
// } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
// stack.pop();
// } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
// stack.pop();
// } else {
// return false;
// }
// }

// return stack.isEmpty();