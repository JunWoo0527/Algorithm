import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> numList = new ArrayList<>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(i==j) {
                    continue;
                }
            Integer sum = numbers[i] + numbers[j];
            if(!numList.contains(sum)) {
                numList.add(sum);
                }   
            }

        }
        
        Collections.sort(numList);
        Integer[] ans = numList.toArray(new Integer[0]);

        int[] answer = Arrays.stream(ans).mapToInt(Integer::intValue).toArray();
        
    
        return answer;
    }
}