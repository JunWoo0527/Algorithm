class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // Yellow는  brown의 가로-2 * 세로-2
        // 그러므로 Brown의 개수를 3이상의 숫자와 그 숫자로로 나눴을대 떨어지는 숫자를 한쌍으로해
        // 해당 숫자쌍의 각각 -2 한 후 곱한 숫자가 yellow인 숫자를 찾아반환 (가로, 세로)
        // 단, 가로는 세로와 같거나 더 크다.
        
        for (int i = 3; i <= brown/2; i++) {
            int width = i;
            int heigh = (brown + yellow)/i;

            if (((width - 2) * (heigh - 2)) == yellow) {
                answer[0] = width;
                answer[1] = heigh;
            } 
        }
        return answer;
    }
}