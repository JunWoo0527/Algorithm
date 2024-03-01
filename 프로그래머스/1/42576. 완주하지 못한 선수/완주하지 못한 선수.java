import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> compmap = new HashMap<>();
        // 참가자 중 완주 하지 못한 1명의 이름을 반환 하는 문제
        // 동명이인이 존재할수 있음(그들의 구분은 없음)
        
        for (int i = 0; i < completion.length; i++) {
            compmap.put(completion[i], compmap.getOrDefault(completion[i], 0) + 1);
        }
        
        for (String s : participant) {
            compmap.put(s, compmap.getOrDefault(s, 0) - 1);
        }
        
        for (String k : compmap.keySet()) {
            if (compmap.get(k) != 0) {
                answer = k;
            }
        }
        
        return answer;
        
    }
}