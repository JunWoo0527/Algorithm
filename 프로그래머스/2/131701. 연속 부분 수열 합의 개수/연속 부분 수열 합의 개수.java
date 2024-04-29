import java.util.*;

class Solution {
    public int solution(int[] elements) {
        // 수열로 만들수있는 모든 합의 경우의 수
        int answer = 0;
        Set<Integer> sumSet = new HashSet<>();
        
        for (int i = 1; i <= elements.length; i++) {
            int sum = 0;
            int num = 0;
            
            for (int j = 0; j < i; j++) {
                sum += elements[j];
            }
            sumSet.add(sum);
            
            while (num < elements.length - 1) {
                sum -= elements[num];
                sum += elements[(i + num) % elements.length];
                num++;
                sumSet.add(sum);
            }
            
        }
        
        answer = sumSet.size();
        return answer;
    }
}