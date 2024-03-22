import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        // data = "코드(code), 날짜(date), 최대수량(maximum), 현재 수량(remain)"
        // ext : 위에4개중 한개
        // vale_ext : ext에 따른 정해준 범위의 숫자
        // sortBy : ext와 동일
        // val_ext보다 적은것 중에서 ,sort_by기준으로 오름차순 
        
        // ext를 index로 Map으로 저장
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("code", 0);
        dataMap.put("date", 1);
        dataMap.put("maximum", 2);
        dataMap.put("remain", 3);
        
        // val_ext보다 작은 데이터값을 저장
        int[][] filterdata = Arrays.stream(data)
            .filter(x -> x[dataMap.get(ext)] < val_ext).toArray(int[][] :: new);
        
        // sort_by 기준으로 오름차순 정렬.
        Arrays.sort(filterdata, (o1, o2) -> o1[dataMap.get(sort_by)] - o2[dataMap.get(sort_by)]);
        
        return filterdata;
    }
}