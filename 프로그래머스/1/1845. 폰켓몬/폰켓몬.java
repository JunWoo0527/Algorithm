import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 가져갈수있는 포켓몬의 수는 전체(N)/2
        // 모든 경우의 수를 조합해서 최대 다른종을 가져갈수있는 숫자는?
        
        Arrays.sort(nums);
        int getnum = nums.length / 2;
        int sum = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                sum++;
                continue;
            }
            
            if(nums[i] == nums[i-1]) {
                continue;
                
            } else {
                sum++;
            }
        }
        if(sum >= getnum) {
            sum = getnum;
        }
        
        return sum;

    }
}