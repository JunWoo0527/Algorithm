import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        // LRU 알고리즘을 사용하여 전체 도시를 조회하는데 걸리는 시간 반환
        // LRU 알고리즘 : 조회한지 오래된 순서로 삭제
        
        // cache hit : 조회하는 도시이름이 캐시에 포함되잇으면 1
        // cache miss : 조회하는 도시이름이 캐시에 포함되있지 않으면 5
        
        List<String> cache = new ArrayList<>();
        if (cacheSize > 0) {
            for (String s : cities) {
            // 대소문자 구분이없기때문에 일괄적으로 대문자처리
                s = s.toUpperCase();
            // 리스트(캐시)안에 조회되는 도시가 없고 캐시 크기상한선에 도달전 일때 캐시에 도시 저장
            // 상한선에 도달 했다면 가장 오래된(index 0)도시를 삭제 후 캐시에 도시 저장
                if (cache.indexOf(s) == -1) {
                    if (cache.size() >= cacheSize) {
                        cache.remove(0);
                    }
                    cache.add(s);
                    answer += 5;
                // 캐시안에 조회되는 도시가 있을경우 해당 도시를 가장 최근조회한 캐시위치로 이동
                } else {
                    cache.remove(s);
                    cache.add(s);
                    answer ++;
                }
            }
        } else {
            answer = 5 * cities.length;
        }
        
        
        return answer;
    }
}