class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        // 인형 뽑기 : 뽑은 인형은 바구니에 담는다
        // 가장 마지막에 올린 인형과 지금 순번에서 올린 인형이 같을경우 두 인형은 사라짐
        // 바구니에 크기는 모든 인형이 들어갈 만큼 크다.
        // 바구니에 마지막 인형이 넣는 인형 과 같은지 여부 확인
        // 또한 인형이 같을시 그전에 넣었던 인형이 마지막인형이 됨으로 반환하는 수의 최대 경우의 수는
        // 전체 인형의수 / 2 
        int basindx = 0;
        int[] basket = new int[4501];
        
        for (int i = 0; i < moves.length; i++) {
            int mp = moves[i];
            for (int j = 0; j < board.length; j++) {
                // 크레인이 인형이 없는 행을 지날때
                if (board[j][mp-1] == 0) {
                    continue;
                }
                // 맨처음 인형 이동 
                if (i == 0 || basindx == 0) {
                    basket[0] = board[j][mp-1];
                    board[j][mp-1] = 0;
                    basindx++;
                    break;
                } 
                // 이동한 인형이 바스켓 위의 인형과 같을시
                if (basket[basindx-1] == board[j][mp-1]) {
                    board[j][mp-1] = 0;
                    basindx--;
                    answer += 2;
                    break;
                    
                // 이동한 인형이 바스켓 위의 인형과 다를시
                } else if (board[j][mp-1] != 0) {
                    basket[basindx] = board[j][mp-1];
                    board[j][mp-1] = 0;
                    basindx++;
                    break;
                }
            }
        }
        return answer;
    }
}