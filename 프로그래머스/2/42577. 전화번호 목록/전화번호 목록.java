import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 한 번호가 다른 번호의 접두어가 되면 false 리턴
        // 모든 번호가 서로의 접두어가 되지않으면 true 리턴
        // 번호는 1개 ~ 1000000개 
        // 중복번호는 없다
        
        Map<String, Integer> m = new HashMap<>();
        
        for (String prefix : phone_book) {
            m.put(prefix, 0);
        }
        
        for (String prefix : phone_book) {
            for (int i = 0; i < prefix.length(); i++) {
                if (m.containsKey(prefix.substring(0, i))) {
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }
}