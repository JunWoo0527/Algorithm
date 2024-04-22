import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stacks = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stacks.empty() && stacks.peek() == c) {
                stacks.pop();
            } else {
                stacks.add(c);
            }
        }


        return stacks.empty() ? 1 : 0;
    }
}