import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        boolean ck = true;
        String[] answer = new String[strings.length];
        Arrays.sort(strings);        
        
        for(int i=0; i<strings.length; i++) {
            answer[i] = strings[i].substring(n,n+1);
        }        
        Arrays.sort(answer);
        
        for(int i=0; i<strings.length; i++) {
            for(int j=0; j<strings.length; j++) {
                if(answer[i].equals(strings[j].substring(n,n+1))) {
                    
                    for(int k=0; k<i; k++) {
                        if(answer[k].equals(strings[j])) {
                            ck= false;
                        }
                    }
                    
                    if(ck == true) {
                        answer[i] = strings[j];
                    }
                    
                    ck = true;
                    
                }
            }
        }
        
        
        return answer;
    }
}