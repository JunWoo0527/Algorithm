
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            for (int j = 0; j < index; j++) {
                c += 1;
                
                if (c > 'z') {
                    c -= 26;
                }
                
                // 증가시킨 문자 c가 skip에 포함될때 한번더 반복 시켜 다음문자로 이동
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            answer += c;
        }
        return answer;
    }
        
}