class Solution {
    public int solution(int n) {
        int answer = 0;
        // n 다음 수는 n보다 크다
        // n 다음수의 2진수로 변환시 n의 2진수 변환시에 1의 개수가 같다.
        // n 다음수는 두조건을 만족하는 수중 가장 작은 수이다.
                
        // n 의 2진변환
        String binaryn = Integer.toBinaryString(n);
        
        // 2진수 n의 비트1 의 개수
        int numn = 0;
        for (int i = 0; i < binaryn.length(); i++) {
            if (binaryn.charAt(i) == '1') {
                numn++;
            }
        }

        // n+1 부터 1000000 까지 2진변환 후 비트1의 개수
        for (int i = n + 1; i < 1000000; i++) {
            String binarynm = Integer.toBinaryString(i);
            int numnm = 0;
            
            for (int j = 0; j < binarynm.length(); j++) {
                if (binarynm.charAt(j) == '1') {
                    numnm++;
                }
            }
            
            if (numn == numnm) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}