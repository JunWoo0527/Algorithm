import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++) {
            boolean isprime = true;
            
            for(int j=2; j<=Math.sqrt(i); j++) {
                
                if(i%j == 0) {
                    isprime = false;
                    break;
                }
            }
            if( isprime == true) {
               answer++; 
            }
        }
        return answer;
    }
}