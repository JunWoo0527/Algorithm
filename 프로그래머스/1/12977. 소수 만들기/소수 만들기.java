import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        boolean chk = true;
        // 소수: 1과 자기자신으로밖에 나눌수있는 숫자
        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    for(int u=2; u<=Math.sqrt(sum); u++) {
                        if( sum%u == 0) {
                            chk = false;
                            break;
                        }
                    }
                    if(chk) {
                        answer++;
                    }
                    chk=true;
                }
            }
        }
        
        return answer;
    }
}