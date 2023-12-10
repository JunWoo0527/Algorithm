import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int slen = score.length;
        Arrays.sort(score);
        
        int[] ascore = Arrays.copyOfRange(score, slen%m, slen);
        for(int i=1 ; i<=ascore.length/m; i++) {
            answer += ascore[(i-1)*m]*m;
        }
        return answer;
    }
}