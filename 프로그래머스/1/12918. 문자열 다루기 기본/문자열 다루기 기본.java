class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int cnt = 0;

        if( s.length() == 4 || s.length() == 6){
            for(int i =0 ; i < s.length() ; i++){
                if( s.charAt(i) < 58){
                    cnt++;
                }
            }
        }
        
        if( cnt == s.length()){
            answer = true;
        }
        


        return answer;
    }
}