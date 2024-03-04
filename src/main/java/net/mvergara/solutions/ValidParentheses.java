package net.mvergara.solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {

    public boolean validParentheses(String s) {
        Deque<Character> strQueue = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                strQueue.push(c);
            } else {
                if (strQueue.isEmpty() || !isMatching(strQueue.pop(), c)) {
                    return false;
                }
            }
        }
        return strQueue.isEmpty();
    }

    private boolean isMatching(Character open, Character close) {
        return (open == '(' && close == ')' || open == '{' && close == '}' || open == '[' && close == ']');
    }
}
