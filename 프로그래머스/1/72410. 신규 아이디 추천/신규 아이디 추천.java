class Solution {
    public String solution(String new_id) {
        StringBuilder s = new StringBuilder();
        String answer;
        
        // 아이디 3~ 15자
        // 알파벳소문자, 숫자, 빼기, 밑줄, 마침표 사용가능
        // 마침표는 처음과 끝에 사용불가, 또한 연속으로 사용불가

        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (('a' <= c && c <= 'z') || ('0' <= c && c <= '9') || c == '-' || c == '_' || c == '.') {
                s.append(c);
            }
        }
        
        // 3단계
        answer = s.toString();
        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }
        
        // 4단계
        if (answer.length() > 0) {
            if (answer.charAt(0) == '.') {
                answer = answer.substring(1, answer.length());
            }
        }
        if (answer.length() > 0) {
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }
        
        // 5단계
        if (answer.length() == 0) {
            answer = "a";
        }
        
        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(14) == '.') {
                answer = answer.substring(0, 14);
            }
        }
        
        // 7단계
        s = new StringBuilder(answer);
        if (s.length() <= 2) {
            while (s.length() < 3) {
                s.append(s.charAt(s.length() - 1));
            }
        }
        
        answer = s.toString();
        
        return answer;
    }
}