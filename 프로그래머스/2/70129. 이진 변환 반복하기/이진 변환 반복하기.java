class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        // 1이 될때까지반복
        while (s.length() != 1) {
            int slen = s.length();
            s = s.replaceAll("0", "");
            int len = s.length();
            s = Integer.toBinaryString(len);
            answer[0]++;
            answer[1] += slen - len;
        }
        
        
        
        return answer;
    }
}