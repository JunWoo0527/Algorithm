class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] indxh = {0, 1, -1, 0};
        int[] indxw = {1, 0, 0, -1};
        
        for (int i = 0; i < 4; i++) {
            int newh = h + indxh[i];
            int neww = w + indxw[i];
                
            if ((newh >= 0 && neww >= 0) && (newh < board.length && neww < board[0].length)) {
                if (board[newh][neww].equals(board[h][w])) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}