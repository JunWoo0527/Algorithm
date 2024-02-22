import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        // 지도는 정사각형 n*n 
        // 두장의 지도를 겹친지도 둘다 공백이면 공백, 둘중 하나라도 벽이면 벽
        // 주어진 정수배열하나를 2진수를 나타낸것이 지도 한줄 row
        // 벽은 1, 공백은 0
        // 출력은 문자열 "#" 과 " "을 조합해서
        String[] map = new String[n];
        String row = "";
        int ar1;
        int ar2;
        int num;
        
        for(int i=0; i<n; i++) {
            ar1 = arr1[i];
            ar2 = arr2[i];
            
            for(int j=1; j<=n; j++) {
                num = (int) Math.pow(2, n-j);
                
                if(ar1 >= num && ar2 >= num) {
                    row += "#";
                    ar1 -= num;
                    ar2 -= num;
                } else if(ar1 >= num && ar2 < num) {
                    row += "#";
                    ar1 -= num;
                } else if(ar1 < num && ar2 >= num) {
                    row += "#";
                    ar2 -= num;
                } else if(ar1 < num && ar2 < num) {
                    row += " ";
                }
                
            }
            map[i] = row;
            row = "";
        }
        return map;
    }
}