import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        // 투포인터 알고리즘(두 포인터의 직전위치를 기억하고 진행하는 알고리즘)
        for (String str : goal) {
            if ((idx1<cards1.length)  && str.equals(cards1[idx1])) {
                idx1++;
            } else if ((idx2<cards2.length) && str.equals(cards2[idx2])) {
                idx2++;
            } else {
                answer = "No";
            }
        }
        return answer;
    }
}