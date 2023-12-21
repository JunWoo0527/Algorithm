class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma" };
        boolean chk = true;
        // 연속 x
        
        for (int j=0; j<babbling.length; j++ ) {
            for (int i=0; i<str.length; i++) {
                babbling[j] = babbling[j].replace(str[i],i+"");
            } 
            
            System.out.println(babbling[j]);
            // 연속문자 검사
            String[] chkstr = babbling[j].split("");
            boolean chkst = false;
            for (int i=0; i<chkstr.length-1; i++) {
                if (chkstr[i].equals(chkstr[i+1])) {
                    chkst = true;
                }
            }
            if (chkst == true) {
                continue;
            }
            // 네가지발음 외 문자 검사
            for (int k=0; k<babbling[j].length(); k++) {
                char c = babbling[j].charAt(k);
                if (!('0' <= c && c <= '9')) {
                    chk = false;
                }
            }
            
            if (chk == true) {
                answer++;
            }
            chk = true;
        }

        
        return answer;
    }
}