class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int len = str.length();
        int[] answer = new int[len];
        int j = 0;
        for(int i = len-1 ; 0<=i; i--){
            answer[j] = str.charAt(i) - 48;
            j++;
        }
        
        return answer;
    }
}