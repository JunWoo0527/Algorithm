import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        // 한번에 2명씩, 무게제한 limit
        // 최대한 적은횟수로 모든 사람을 구출
        
        // 몸무게 중복값은 존재할수있다.
        
        // 오름차순 정렬
        int answer = 0;
        Arrays.sort(people);

        int weight = 0;
        int left = 0;
        int right = people.length - 1;
        
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            
            answer++;
        }
        
        return answer;
    }
}