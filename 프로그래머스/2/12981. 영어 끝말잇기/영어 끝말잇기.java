import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> usedWords = new HashSet<>();
        // n 참가하는 사람 수
        // words 단어 목록
        // 같은 단어 x 앞서말한단어의 끝문자로 시작하는 끝말잇기
        // 최초 탈락하는 번호와 몇번째 차례에서 탈락하는가
        // 탈락자가없으면 0, 0 리턴
        
        usedWords.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            String beforeword = words[i-1];
            String nowword = words[i];
        
            if ((beforeword.charAt(beforeword.length() - 1) != nowword.charAt(0)) 
                || usedWords.contains(nowword)) {
                
                System.out.println(i);
                if ((i + 1) % n == 0) {
                    answer[0] = n;
                } else {
                    answer[0] = (i + 1) % n;
                }
                if ((i + 1) % n != 0) {
                    answer[1] = (i + 1) / n + 1;
                } else {
                    answer[1] = (i + 1) / n ;
                }
                
                return answer;
            }
            usedWords.add(nowword);
            
            
        }
        answer[0] = 0;
        answer[1] = 0;
        

        return answer;
    }
}