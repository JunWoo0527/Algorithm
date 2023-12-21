import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int cnt = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
        // 여벌을 가지고있으나 도난당했을시 자기가 써야한다.
        
        // 자기여벌사용하는 경우
        for (int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i]=-1;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        
        // 빌리는경우
        for (int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if( lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
                    lost[i]=-1;
                    reserve[j]=-1;
                }
            }
        }
        
        for(int i : lost) {
            if(i>0) {
                cnt++;
            }
        }
        
        answer = n - cnt;
        
        return answer;
    }
}