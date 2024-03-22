import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        // 선물을 더많이 준사람이 다음달에 선물을 적게받은사람에게 선물을 하나받는다
        // 기록이 없거나 횟수가 같다면 선물지수가 더 큰사람이 작은사람에게 선물을 하나받는다.
        // 선물지수 = 총 준 선물의 횟수 - 총 받은 선물의 횟수
        // 선물지수도 같다면 다음달에 선물 주고받지않는다.
        // return은 다음달에 가장 많은 선물을 받는 친구의 받은 선물의 수
        
        // 각 친구들간의 선물에 대해 저장 
        // 이차원 배열을 사용 -> 행과 열의 제목인 friends를 map으로 저장
        Map<String, Integer> nameMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            nameMap.put(friends[i], i);
        }
        
        // 선물지수 일차배열 score, 친구들간 선물받은 기록 이차배열 record
        int[] score = new int[friends.length];
        int[][] record = new int[friends.length][friends.length];
        
        // gifts -> 선물지수와 선물교환기록
        for (String s : gifts) {
            String[] str = s.split(" ");
            score[nameMap.get(str[0])]++;
            score[nameMap.get(str[1])]--;
            record[nameMap.get(str[0])][nameMap.get(str[1])]++;
        }
        
        // 다음달에 선물 개수 계산
        for (int i = 0; i < friends.length; i++) {
            
            // friends 순서대로 선물 계산
            int number = 0;
            for (int j = 0; j < friends.length; j++) {
                
                // 자기한테 주는 경우는 없으므로 i == j 는 통과
                if (i == j) {
                    continue;
                }
                
                // 선물을 많이준경우 , 선물을 주고받은개수는 같으나 선물지수가 높을경우 다음달받을 선물 수 증가
                if (record[i][j] > record[j][i]) {
                    number++;
                } else if (record[i][j] == record[j][i] && score[i] > score[j]) {
                    number++;
                }
                
            }
            answer = Math.max(answer, number);
        }
        
        return answer;
    }
}