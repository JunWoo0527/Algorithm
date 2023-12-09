class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] cs = s.split("");
        for(int i=0; i<s.length(); i++) {              //뽑은문자
            
            if(i==0) {                                 // 시작시 -1 
                answer[i] = -1;
                continue;
            }
            
            for(int j=i-1; j>=0; j--) {                   //비교대상범위
                if(cs[i].equals(cs[j])) {
                    answer[i] = i-j;
                    break;
                }
                answer[i] = -1;
            }
        
        }
        
        
        return answer;
    }
}