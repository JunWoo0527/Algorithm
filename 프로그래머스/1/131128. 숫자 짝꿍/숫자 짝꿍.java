class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        for (int i=9; i>=0; i--) {
            int xnum = Countnum(X,i);
            int ynum = Countnum(Y,i);
            int minnum = Math.min(xnum, ynum);
            
            answer += String.valueOf(i).repeat(minnum);
        }
        
        if (answer.indexOf("0") == 0) {
            answer = "0";
        }
        
        if (answer.equals("")) {
            answer = "-1";
        }
            
         return answer;
    }
        
    public int Countnum(String str, int y) {
        return str.length() - str.replace(String.valueOf(y), "").length();
    } 
}
