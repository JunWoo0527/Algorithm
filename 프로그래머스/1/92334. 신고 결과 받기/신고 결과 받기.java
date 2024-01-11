import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 한번에 한명 신고가능 여러번해도 1번으로 처리
        // k번이상 신고당하면 정지 -> 신고한 모든유저에게 메일발송
        // 각 유저별 처리결과 메일받은횟수 return
        
        Map<String, Integer> idMap = new HashMap<>();
        Map<String, List<String>> reportMap = new HashMap<>();
        
        for (int i=0; i<id_list.length; i++) {
            idMap.put(id_list[i], i);
            reportMap.put(id_list[i], new ArrayList<>());
        }
        
        for (String name : report) {
            String[] nameArray = name.split(" ");
            String reportname = nameArray[0];
            String reportedname = nameArray[1];
            
            if (!reportMap.get(reportedname).contains(reportname)) {
                reportMap.get(reportedname).add(reportname);
            }
        }
        
        for (String key : reportMap.keySet()) {
            if (k <= reportMap.get(key).size()) {
                for (String re : reportMap.get(key)) {
                    answer[idMap.get(re)]++;
                }
            }
        }
        
        
        return answer;
    }
}