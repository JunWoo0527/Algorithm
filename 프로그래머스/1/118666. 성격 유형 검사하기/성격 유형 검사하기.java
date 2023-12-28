import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer ="";
        // 비동의 네오형일수도있고 어피치형이일수도있다.
        // survey 첫번째 비동의, 두번째 동의
        
        // R,T, C,F, J,M, A,N
        Map<String,Integer> score = new HashMap<>();
        score.put("R",0);
        score.put("T",0);
        score.put("C",0);
        score.put("F",0);
        score.put("J",0);
        score.put("M",0);
        score.put("A",0);
        score.put("N",0);
        
        for (int i=0; i<choices.length; i++) {
            int cho = choices[i];
            String key = String.valueOf(survey[i].charAt(cho/4));
            int sc = score.get(key);
            score.replace(key , sc + Math.abs(cho-4));
        }
        
        answer += score.get("R") >= score.get("T") ? "R" : "T";
        answer += score.get("C") >= score.get("F") ? "C" : "F";
        answer += score.get("J") >= score.get("M") ? "J" : "M";
        answer += score.get("A") >= score.get("N") ? "A" : "N";
        
        return answer;
        // return new StringBuilder()
        //     .append(score.get("R") >= score.get("T") ? "R" : "T")
        //     .append(score.get("C") >= score.get("F") ? "C" : "F")
        //     .append(score.get("J") >= score.get("M") ? "J" : "M")
        //     .append(score.get("A") >= score.get("N") ? "A" : "N")
        //     .toString();
    }
}