class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String[] tmp = s.split("");
        int num = 0;
        
        // 반드시 "(" 뒤에 ")" 이 와야한다.
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].equals("(")) {
                num++;
            } else {
                num--;
            }
            
            if (num < 0) {
                break;
            }
        }
        
        if (num == 0 && tmp[0].equals("(") && tmp[tmp.length-1].equals(")")) {
            answer = true;
        }

        return answer;
    }
}