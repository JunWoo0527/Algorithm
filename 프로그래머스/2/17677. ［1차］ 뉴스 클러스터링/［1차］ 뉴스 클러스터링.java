import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // 자카드유사도 = 교집합 / 합집합
        // 다중집합원소 오직 영어두글자로만 이뤄진(대소문자구분x)
        
        // 대문자 변환
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        
        List<String> anb = new ArrayList<>();
        List<String> aub = new ArrayList<>();
        
        // 영문자로만 이뤄진 다중집합원소
        for (int i = 0; i < str1.length()-1; i++) {
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            
            if (Character.isLetter(first) && Character.isLetter(second)) {
                a.add(String.valueOf(first) + String.valueOf(second));
            }
        }
        
        for (int i = 0; i < str2.length()-1; i++) {
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            
            if (Character.isLetter(first) && Character.isLetter(second)) {
                b.add(String.valueOf(first) + String.valueOf(second));
            }
        }
        
        // a 집합의 원소가 b에 포함된다면 교집합에 추가 후 삭제 , a집합 합집합에 추가
        for (String as : a) {
            if (b.remove(as)) {
                anb.add(as);
            }
            aub.add(as);  
        }
        
        // 남은 b집합의 원소들 합집합에 추가
        for (String bs : b) {
            aub.add(bs);
        }
        
        if (aub.size() == 0) {
            return 65536;
        }
        
        answer = (anb.size() * 65536) / aub.size();
    
        return answer;
    }
}