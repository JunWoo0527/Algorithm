import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
//         String arr = Arrays.toString(array).replaceAll("[^0-9]","");
        
//         for(int a=0; a<commands.length; a++) {
//             String subarr = arr.substring(commands[a][0]-1, commands[a][1]);
            
//             char[] carr = subarr.toCharArray();
//             Arrays.sort(carr);
//             char c = carr[commands[a][2]-1];
            
//             answer[a] =  Integer.valueOf(c-'0');
//         }
        for(int a=0; a<commands.length; a++) {
            int[] subArray = Arrays.copyOfRange(array, commands[a][0]-1, commands[a][1]);
            Arrays.sort(subArray);
            answer[a] = subArray[commands[a][2]-1];
            }
        return answer;
    }
}