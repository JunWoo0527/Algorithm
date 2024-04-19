class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 0;
        int y = 1;
        int i = 1;
        while (i < n) {
            answer = ((x % 1234567) + (y % 1234567)) % 1234567;
            x = y;
            y = answer;
            i++;
        }
        
        
        return answer;
    }
}