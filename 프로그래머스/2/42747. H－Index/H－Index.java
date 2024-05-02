import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        // H-index : x번 인용된 논문의 수 y 일때 x >= y 가 성립하는 최대 논문수
        int x = 0;
        int y = 0;
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
            x = citations[i];
            y = citations.length - i;
            
            if (x >= y) {
                answer = y;
                break;
            }
        }
        
        return answer;
    }
}