class Solution {
    public String solution(int n) {
        String answer = "";
        if(n ==1 ){
            return answer = "수";
        }
        
        for(int i = 0; i < n/2; i++){
                answer += "수박";
        }
        
        if(n%2 ==1 ){
            answer += "수";
        }
        
        
        return answer;
    }
}