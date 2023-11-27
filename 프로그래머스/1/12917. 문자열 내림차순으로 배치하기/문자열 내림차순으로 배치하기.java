import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 단순 문자열   문자열배열로 전환
        String[] str = s.split("");
        
        // 내림차순 배치
        Arrays.sort(str, Collections.reverseOrder());
        
        // 문자열 배열 단순문자열 변환
        for(String a : str){
            answer += a;
        }
        

        return answer;
    }
}