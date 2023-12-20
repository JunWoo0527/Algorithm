import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        
        List<Integer> winnum = new ArrayList<>();
        for (int i : win_nums) {
            winnum.add(i);
        }
        
        int cnt = 0;
        int cnt0 = 0;
        
        for (int i : lottos) {

            
            if (winnum.contains(i)) {
                cnt++;
            } else if(i==0) {
                cnt0++;
            }
        }
        
        if (cnt>1) {
            answer[1] = 7 - cnt; 
        } else {
            answer[1] = 6;
        }
        
        cnt += cnt0;
        if (cnt>1) {
            answer[0] = 7 - cnt; 
        } else {
            answer[0] = 6;
        }
        
        return answer;
    }
}