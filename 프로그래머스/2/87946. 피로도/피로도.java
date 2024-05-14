import java.util.*;

class Solution {
    static boolean[] visited;
    static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        // 최소피로도 : 실제로 소모되지는 않지만 시작하기위한 최소한의 요구 피로도
        // 소모피로도 : 던전 종료시 소모되는 실제 피로도
        // 최대한 많은 던전을 탐험
        
        // 1-2-3, 1-3-2, 2-1-3... 모든 경우의 수 탐색(완전탐색)
        // 재귀함수 사용
        visited = new boolean[dungeons.length];
        
        exploreDungeon(k, dungeons, 0);        
        return answer;
    }
    
    public void exploreDungeon(int k, int[][] dungeons, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            int minFatigue = dungeons[i][0];
            int usedFatigue = dungeons[i][1];
            
            // 방문하지않았고 남은 피로도가 최소피로도보다 높을시 탐색진행
            if (k >= minFatigue && visited[i] == false) {
                visited[i] = true;
                exploreDungeon(k - usedFatigue, dungeons, count + 1);
                // 진행불가시 다음 탐색을 위해 초기화
                visited[i] = false;
            }
        }
        answer = Math.max(answer, count);
    }
}