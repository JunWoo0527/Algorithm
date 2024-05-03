class Solution {
    public int[] solution(int n, long left, long right) {
        // n x n 행렬을 만든 후 
        // 각각 행과 열의 인덱스를 비교해 가장 큰수를 집어넣고
        // 각각 행을 잘라 1행으로 붙인 후
        // 이를 arr[left] ~ arr[right] 를 잘라 리턴
        
        // 각각 숫자는 행과 열중 큰숫자
        int le = (int) left;
        int ri = (int) right;
        int[] answer = new int[ri - le + 1];
        
        int indx = 0;
        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            answer[indx++] = Math.max((int)row, (int)col) + 1;
        }
        
        
        return answer;
    }
}