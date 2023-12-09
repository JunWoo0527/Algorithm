import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int rank =1;
        
        for(int i=0; i<score.length; i++) {
            
            if(i==0) {
                answer[i] = score[i];        //시작값
                
            } else if(i<k) {                 // k까지
                
                if( answer[i-1] < score[i]) {
                    answer[i] = answer[i-1];
                    
                }else {
                    answer[i] = score[i];
                }
                
            } else {                         // k이상
                int[] intarray = Arrays.copyOfRange(score,0,i+1);
                Arrays.sort(intarray);
                answer[i] = intarray[i-k+1];
                
            }
                
        }
        return answer;
    }
}
