import java.util.*;

class Solution {
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        // 깊이 우선 탐색 DFS 알고리즘
        dfs(numbers, 0, target, answer);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) {
            if (target == sum) {
                answer++;
            }
            return;
        }
        
        int plusnum = sum + numbers[depth];
        int minusnum = sum - numbers[depth];
        depth++;
            
        dfs(numbers, depth, target, plusnum);
        dfs(numbers, depth, target, minusnum);
    }
}