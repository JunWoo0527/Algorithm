import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> rateMap = new HashMap<>();
        Double[] sortRate = new Double[N];
        Double rate;
        int indx = 0;
        
        // 실패율 = 스테이지 도달 but 클리어x 플레이어 수 / 스테이지 도달 플레이어 수
        // 실패율이 높은 스테이지부터 내림차순으로 스테이지 번호 반환
        
        for(int i=1; i <= N; i++) {
            double noClear = 0;
            double reach = 0;
            
            for(int s : stages) {
                if(i < s) {
                    reach++;
                } else if(i == s) {
                    noClear++;
                    reach++;
                }
                
            }
            if(noClear == 0) {
                rate = 0.0;
            } else {
                rate = noClear / reach;
            }
            rateMap.put(i, rate);
            sortRate[i-1] = rate;
        }
        
        // for(int i=0; i<N; i++) {
        //     System.out.println(rateMap.get(i+1));
        // }
        
        Arrays.sort(sortRate, Collections.reverseOrder());
        
        for(Double i : sortRate) {
            for(Integer j : rateMap.keySet()) {
                // System.out.println(rateMap.get(j) + "  " + i);
                if(rateMap.get(j) == i && rateMap.get(j-1) != i) {
                    answer[indx] = j;
                    indx++;
                    continue;
                }
            }
        }

        
        return answer;
    }
}