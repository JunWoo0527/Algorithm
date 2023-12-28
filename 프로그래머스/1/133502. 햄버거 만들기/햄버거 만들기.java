import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        // 조건 1,2,3,1 순서로만 햄버거를 만들수있다.
        // ingredient는 바뀌지않는다.
        // 햄버거를 만들면 그재료를 빼고 남은재료로 또 햄버거를 만들 수 있다.
        
        List<Integer> intl = new ArrayList<>();
        for (int i : ingredient) {
            intl.add(i);  
            
            while (intl.size() >= 4) {
                if (!(intl.get(intl.size()-1) == 1 &&
                    intl.get(intl.size()-2) == 3 &&
                    intl.get(intl.size()-3) == 2 &&
                    intl.get(intl.size()-4) == 1)
                   ) {
                    break;
                }
                                    // intl.subList(intl.size()-4,intl.size()-1).clear();  //실행시간초과
                    for (int j=0; j<4; j++) {
                        intl.remove(intl.size()-1);
                    }
                    answer++;
            }
        }
        
        
        
        return answer;
    }
}