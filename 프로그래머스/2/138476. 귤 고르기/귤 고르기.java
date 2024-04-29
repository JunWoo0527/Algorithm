import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // k개의 귤을 상자에 담을때 크기가 다른 귤들의 종류를 최소화하여 리턴
    
        Map<Integer, Integer> tmp = new HashMap<>();
        int answer = 0;
        int boxin = 0;
        
        // 귤들의 각 크기에 대한 개수를 Map형태로 저장    
        for (int i : tangerine) {
            tmp.put(i, tmp.getOrDefault(i, 0) + 1);
        }
        
        // 귤들의 각 크기에 대한 개수를 내림차순으로 정렬
        List<Integer> listTmp = new ArrayList(tmp.values());
        Collections.sort(listTmp, Collections.reverseOrder());
        
        // 개수가 많은것부터 박스에 담을때 k의 개수와 비교하며 k보다 많거나 같으면 중단하고 그때까지 넣은 종류의 개수 리턴
        for (int i : listTmp) {
            if (boxin + i >= k) {
                answer++;
                break;
            } else {
                boxin += i;
                answer++;
            }
        }
        return answer;
    }
}