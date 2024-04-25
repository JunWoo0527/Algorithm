class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        // 총 참가자수 n, A의 번호 a, B의 번호  b
        // A와 B는 몇번째 라운드에서 만나는지 리턴
        // A와 B는 만나기전까지 모든 경기에서 승리한다고 가정
        
        // N은 2의 거듭제곱꼴로 나오므로 부전승은 발생x
        while (a != b) {
            answer++;
            
            if (a % 2 == 1) {
                a = (a + 1) / 2;
            } else {
                a = a / 2;
            }
            
            if (b % 2 == 1) {
                b = (b + 1) / 2;
            } else {
                b = b / 2;
            }
        }

        return answer;
    }
}