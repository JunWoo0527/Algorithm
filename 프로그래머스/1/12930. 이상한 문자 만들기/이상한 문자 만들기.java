import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        int num = 0;
        
        for(String sc : str) {
            
            // index 초기화
            if( sc.contains(" ")) {
                num = 0;
            } else {
                num ++;
            }
            
            if( num % 2 == 0) {
                answer += sc.toLowerCase();
            } else {
                answer += sc.toUpperCase();
            }
            
        }
        return answer;
    }
}
