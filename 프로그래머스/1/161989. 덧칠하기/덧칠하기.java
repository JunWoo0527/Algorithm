class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintsection =0;
        for(int i=0; i<section.length; i++) {
            if(section[i] < paintsection) {
                continue;
            }
            
            paintsection = section[i] + m;
            answer++;

        }
        
        
        
        return answer;
    }
}