class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        if (num%1 != 0){
            answer = -1;
        } else{
            answer = (long)Math.pow(num+1,2);
        }
        
        
        return answer;
    }
}