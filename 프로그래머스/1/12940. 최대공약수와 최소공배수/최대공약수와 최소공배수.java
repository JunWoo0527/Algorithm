class Solution {
    public long[] solution(int n, int m) {
        int A=0;
        int B=0;
        int C=0;
        
        // 두수의 곱 = 최대 공약수 * 최소 공배수
        // 두수의 곱
        long nm = n * m;
        
        // 최대 공약수
        long div = 0;

        if( n==m){
            div = n;
        }else if(n>m){
            A = n;
            B = m;
        }else{
            A = m;
            B = n;
        }
        while( A%B !=0){
            C = A%B;
            A = B;
            B = C;
        }
        div = B;
        
        // 최소공배수
        long mul = nm / div;
        
        long[] answer = {div, mul};
        return answer;
    }
}