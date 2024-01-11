import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        
        // 첫글자는 대문자 그뒤에는 소문자
        for (int i=0; i<str.length; i++) {
            
            if (str[i].length() == 0) {
                answer += " ";
                
            } else {
                answer += str[i].substring(0,1).toUpperCase();
                answer += str[i].substring(1,str[i].length()).toLowerCase();
                answer += " ";
                
//                 str[i] = str[i].toLowerCase();

//                 String[] temp = str[i].split("");

//                 temp[0] = temp[0].toUpperCase();

//                 answer += String.join("",temp);
            }


            // 0번 문자열..1번 문자열..
//             if (str[i].charAt(0) <= 57) {
//                 answer += str[i].charAt(0);
//             }else {
//                 answer += String.valueOf(str[i].charAt(0)).toUpperCase();
//             }
            
//             for (int j=1; j<str[i].length(); j++) {
//                 answer += String.valueOf(str[i].charAt(j)).toLowerCase();
//             }
            
//             if (i<str.length-1) {
//                 answer += " ";
//             }
            
        }
        if (s.substring(s.length()-1, s.length()).equals(" ")) {
            return answer;
        }
        
        return answer.substring(0, answer.length()-1);
    }
}