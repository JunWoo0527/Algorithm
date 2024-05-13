import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int[] startnum = new int[priorities.length];
        // 우선순위 큐 선언(내림 차순)
        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        
        // 우선순위 큐에 우선순위 요소 추가
        for (int i : priorities) {
            que.offer(i); 
        }
        
        // 큐가 빌때까지 반복
        while (!que.isEmpty()) {
            // 우선순위 배열 순회
            for (int i = 0; i < priorities.length; i++) {
                // 현재 큐 삭제 요소와 우선수위 배열요소 위치 같을경우 큐 요소 삭제 및 프로세스 실행
                if (que.peek() == priorities[i]) {
                    que.poll();
                    answer++;
                    
                    // i 와 location이 같을때 실행순서 반환
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}