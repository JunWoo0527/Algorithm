import java.util.Arrays;
import java.util.Collections;


class Solution {
    public long solution(long n) {
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String answer = "";
        
        for(String a : str){
            answer += a;
        }
        
        return Long.parseLong(answer);
    }
}