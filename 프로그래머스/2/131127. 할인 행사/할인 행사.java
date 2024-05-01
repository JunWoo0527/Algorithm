import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        // 마트의 회원대상 할인기간(10일) 동안 want의 품목이 number수량만큼 discount에 포함되있어야할때
        // 할인을 받을수 있는 총일수
        
        // 회원자격 유지일수 10일 
        // wnat품목이 10개 연속으로 discount에 배열일때만 일수 카운트(순서x)
        // want품목은 1개이상 10개이하 단, number의 수의 합은 10 -> 반드시 원하는품목의 개수는 10개고정
        
        // want품목을 key, number 수량을 value로 Map자료구조로 저장
        // 이를 disocount를 이중반복문으로 map에 품목들을 하나씩 소거할때 10개가 다 소거되면 총일수로 카운트
        
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        Map<String, Integer> cloneMap = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        for (int i = 0; i < discount.length - 9; i++) {
            cloneMap.putAll(wantMap);
            
            for (int j = i; j < i + 10; j++) {
                if (!cloneMap.containsKey(discount[j])) {
                    break;
                }
                
                if (cloneMap.get(discount[j]) == 1) {
                    cloneMap.remove(discount[j]);
                } else {
                    cloneMap.put(discount[j], cloneMap.get(discount[j]) - 1);
                }
                
            }
            
            if (cloneMap.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}