class Solution {
    public int solution(long num) {
        int answer = 0;
        if (num == 1){
            answer = 0;
        } else{
            while(num != 1){
                if (num%2 == 0) {
                    num = num / 2;
                } else {
                    num = num * 3 + 1;
                }
                answer += 1;
                if (answer > 499){
                    answer = -1;
                    break;
                }
             }
        }
        return answer;
    }
}