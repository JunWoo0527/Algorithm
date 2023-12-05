import java.util.*;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        int numLen = number.length;
        
        Arrays.sort(number);
        
        for(int i = 0; i <= numLen-3; i++) {
            for(int j = i+1; j <= numLen-2; j++) {
                for(int k = j+1; k <= numLen-1; k++) {
                
                    int sum = number[i] + number[j] + number[k];
                    if(sum == 0) {
                    answer++;
                    }
                }
            }
        }
            
            
            
        return answer;
    }
}