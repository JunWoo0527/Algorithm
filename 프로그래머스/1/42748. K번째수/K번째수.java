import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int a=0; a<commands.length; a++) {
            int[] subArray = Arrays.copyOfRange(array, commands[a][0]-1, commands[a][1]);
            
            Arrays.sort(subArray);
            
            answer[a] = subArray[commands[a][2]-1];
            
            }
        return answer;
    }
}