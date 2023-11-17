class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int a = phone_number.length();
        
        for(int i =0; i< a-4; i++){
            answer += "*";
        }
        answer += phone_number.substring(a-4);

        return answer;

    }
}