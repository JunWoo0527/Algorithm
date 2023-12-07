import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] cs = s.toCharArray();
        
        for(char c : cs) {

            if(c == ' ') {
                answer += c;
            }else if( c>=97 && c<=122) {
                answer += (char)(97 + (c+n-97)%26);
            }else if( c>=65 && c<=90) {
                answer += (char)(65 + (c+n-65)%26);
            }
        }
        return answer;
    }
}