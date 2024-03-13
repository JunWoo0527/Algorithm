import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        // today 기준으로 privacies의 날짜 + terms기한 이 넘을경우 해당 번호를 반환
        
        Map<String, Integer> termsMap = new HashMap<>();
        for (String s : terms) {
            termsMap.put(s.substring(0,1), Integer.valueOf(s.substring(2)));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String day = privacies[i].substring(0, privacies[i].length() - 2);
            
            int endday = sumdate(day) 
                + termsMap.get(privacies[i].substring(privacies[i].length()-1)) * 28;
            
            if (endday <= sumdate(today)) {
                answer.add(i + 1);
            }
            
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int sumdate (String date) {
        String[] dayarray = date.split("\\.");
        
        int year = Integer.valueOf(dayarray[0]);
        int month = Integer.valueOf(dayarray[1]);
        int day = Integer.valueOf(dayarray[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }
}