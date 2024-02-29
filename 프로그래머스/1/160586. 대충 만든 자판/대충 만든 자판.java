import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        // hashmap을 사용해서 중복제거를 사용
        Map<Character, Integer> kmap = new HashMap<>();
        
        for (String k : keymap) {
            for (int i = 0; i < k.length(); i++) {
                kmap.put(k.charAt(i), Math.min(i+1, kmap.getOrDefault(k.charAt(i), 101)));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            
            for (int j = 0; j < targets[i].length(); j++) {
                int indx = 0;
                indx = kmap.getOrDefault(targets[i].charAt(j), -1);
                
                if (indx == -1) {
                    sum = -1;
                    break;
                } else {
                    sum += indx;
                }

            }
            answer[i] = sum;
            
        }
        return answer;
        
    }
}