import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        // 시간초과
//         List<String> pList = new LinkedList<>(Arrays.asList(players));
//         for (String s : callings) {
//             int f = pList.indexOf(s);
//             pList.remove(s);
//             pList.add(f-1, s);
//         }
        
//         String[] answer = pList.toArray(new String[0]);
        // HashMap
        Map<String, Integer> pMap = new HashMap<>();
        // 1,2,3....
        for (int i=0; i<players.length; i++) {
            pMap.put(players[i], i);
        }
        
        for (String s : callings) {
            int backnum = pMap.get(s);
            String frontp = answer[backnum-1];
            answer[backnum-1] = s;
            answer[backnum] = frontp;
            pMap.put(frontp, backnum);
            pMap.put(s, backnum-1);

        }
        
        return answer;
    }
}