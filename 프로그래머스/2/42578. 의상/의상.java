import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        // 각 의상은 종류별로 최대 1개 착용가능, 착용 안할수도있으나 반드시 종류불문 한가지는 착용해야함
        // 이때 각기 다른 의상이라고 판별
        // [의상이름, 의상의 종류]로 저장되있음
        Map<String, Integer> cMap = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            cMap.put(clothes[i][1], cMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String s : cMap.keySet()) {
            answer *= (cMap.get(s) + 1); 
        }   
        
        answer -= 1;
        
        return answer;
    }
}