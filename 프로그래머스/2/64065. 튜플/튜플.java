import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(1, s.length()-2).replace("{", "");
    
        String[] str = s.split("},");
        Arrays.sort(str, (String s1, String s2) -> s1.length() - s2.length());
        
        int[] answer = new int[str.length];
        List<Integer> list = new ArrayList<>();
        
        for (String i : str) {
            String[] istr = i.split(",");
            for (String j : istr) {
                int tmp = Integer.valueOf(j);
                if (!list.contains(tmp)) {
                    list.add(tmp);
                }
                
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}