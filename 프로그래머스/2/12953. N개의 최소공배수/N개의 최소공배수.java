class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        if (arr.length == 1) {
            return answer;
        }
        
        // 유클리드 호제법을 사용하여 최대공약수를 구한 후 이를 통해 최소공배수를 구한다.
        // 3개 이상의 숫자가 주어진경우 제일 앞 두 숫자의 최소공배수를 구한후 
        // 그 최소 공배수와 그 다음수 식으로 구해나간다.
        for (int i = 1; i < arr.length; i++) {
            // 유클리드 호제법(최대공약수 gcd)
            int a = 0;
            int b = 0;
            if (answer > arr[i]) {
                a = answer;
                b = arr[i];
            } else {
                a = arr[i];
                b = answer;
            }
            
            int gcd = 0;
            int c = 0;
            // a = b * a/b + a%b
            while (a != 0 && b != 0) {
                c = a;
                a = b;
                b = c % b;
            }
            
            if (a == 0) {
                gcd = b;
            } else {
                gcd = a;
            }
            // 최소공배수
            answer = (answer * arr[i]) / gcd;
        }
        
        
        return answer;
    }
}