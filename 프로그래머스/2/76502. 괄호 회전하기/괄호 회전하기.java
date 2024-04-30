class Solution {
    public int solution(String s) {
        // 0부터 문자열길이만큼 모든문자의 인덱스를 - (회전) 했을때
        // 올바른 문자열인지 판단하여 올바른 문자열의 개수를 리턴
        
        // 올바른 문자열의 정의
        // 소,중,대 괄호가 각각 열고 닫고가 짝지어져있을경우
        int answer = 0;
        int len = s.length();
        
        for (int shift = 0; shift < len; shift++) {
            // 문자열 회전
            String str = s.substring(shift) + s.substring(0, shift);
            
            String beforestr = str;
            String afterstr = "";
            while (true) {
                
                afterstr = beforestr.replace("()", "").replace("{}", "").replace("[]", "");
                if (afterstr.length() == beforestr.length()) {
                    break;
                } else {
                    beforestr = afterstr;
                }
            }
            
            if (afterstr.length() == 0) {
                answer++;
            }   
        }
        
        return answer;
    }
}