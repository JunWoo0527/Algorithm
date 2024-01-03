class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ");
        
        int min = Integer.parseInt(array[0]);
        int max = min;
        for (String str : array) {
            
            
            int x = Integer.parseInt(str);
            min = Math.min(min,x);
            max = Math.max(max,x);
        }
        answer = min + " " + max;
        return answer;
    }
}