import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] point = new int[3];
        int indx = 0;
        
        // 0~10점 , 제곱, * : 전과 지금 숫자 2배 플러스, # : 지금숫자 2배 마이너스
        
        for (int i = 0; i < dartResult.length(); i++) {
            
            if (i !=0 && dartResult.charAt(i-1) == '1' && dartResult.charAt(i) == '0') {
                point[indx-1] = 10;
            } else if ('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9') {
                point[indx] = dartResult.charAt(i) - '0';
                indx++;
            }
            
            if (dartResult.charAt(i) == 'D') {
                point[indx-1] = (int) Math.pow(point[indx-1], 2);
            } else if (dartResult.charAt(i) == 'T') {
                point[indx-1] = (int) Math.pow(point[indx-1], 3);
            }
            
            if (dartResult.charAt(i) == '*') {
                if (indx > 1) {
                    point[indx-1] *= 2;
                    point[indx-2] *= 2;
                } else {
                    point[indx-1] *= 2;
                }
            } else if (dartResult.charAt(i) == '#') {
                point[indx-1] *= -1;
            }
            
        }
        
        for (int p : point) {
            answer += p;
        }
        
        return answer;
    }
}