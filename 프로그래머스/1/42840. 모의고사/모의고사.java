import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> ans = new ArrayList<>();
        int[] ans1 = {1, 2, 3, 4, 5};
        int[] ans2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ans3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] sc = {0, 0, 0};
        

        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == ans1[i%5]) {
                sc[0]++;
            }
            if(answers[i] == ans2[i%8]) {
                sc[1]++;
            }
            if(answers[i] == ans3[i%10]) {
                sc[2]++;
            }
        }
        
        int max =0;
        for(int i=0; i<sc.length; i++) {
            max = Math.max(sc[i], max);
        }
        
        for(int i=0; i<sc.length; i++) {
            if(max==sc[i]) {
                ans.add(i+1);
            }
        }
        
        int[] answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}