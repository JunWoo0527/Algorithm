import java.lang.Math;
import java.util.*;

class Solution {
    public long solution(int n) {
        long answer = 0;
        
        // 10진수 -> 3진수
        String S = Integer.toString(n,3);
        
        int num = -1;
        
        for(String c : S.split("")){
            num += 1;
            if( c.equals("0")){
                continue;
            } else if( c.equals("1")){
                answer += Math.pow(3,num); 
            } else {
                answer += Math.pow(3,num) * 2 ; 
            }
        }
        
        return answer;
    }
}