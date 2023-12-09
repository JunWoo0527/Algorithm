import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        int num = 1;
        
        for(int i=1; i<food.length; i++) {
            for(int j=0; j<food[i]/2; j++) {
                answer += num;
            }
            num++;
        }
        
        String[] reanswer = answer.split("");
        answer = answer + "0";
        
        for(int j=reanswer.length-1; j>=0; j-- ) {
            answer += reanswer[j];
        }
        return answer;
    }
}