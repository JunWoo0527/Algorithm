import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 0;
        List<Integer> list = new ArrayList<>();
        int num = 1;
        int beforeday = (100 - progresses[0]) / speeds[0];
        if ((100 - progresses[0]) % speeds[0] != 0) {
            beforeday++;
        }
        
        for (int i = 1; i < progresses.length; i++) {
            day = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                day++;
            }
            if (beforeday < day) {
                list.add(num);
                num = 1;
                beforeday = day;
            } else {
                num++;
            }
        }
        list.add(num);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}