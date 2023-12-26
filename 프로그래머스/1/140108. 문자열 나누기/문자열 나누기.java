class Solution {
    public int solution(String s) {
        int answer = 0;
        char c = s.charAt(0);
        int f = 0;
        int d = 0;
        for (int i=0; i< s.length(); i++) {
            if (f==d) {
                answer++;
                c = s.charAt(i);
            }
            if (c==s.charAt(i)) {
                f++;
            } else {
                d++;
            }
        }
        
        return answer;
    }
}