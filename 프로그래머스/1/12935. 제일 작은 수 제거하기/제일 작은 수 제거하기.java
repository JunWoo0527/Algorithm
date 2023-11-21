
class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length==1) {
            int[] answer = {-1};
            return answer;
        }
        
        // 최소값 탐색
        int min = arr[0];
        for(int i =0; i<arr.length; i++){
            min = Math.min(min,arr[i]);
        }
        
        // 새로운 배열 생성
        int[] answer = new int[arr.length-1];
        int num = 0;
        
        for(int i = 0; i<arr.length; i++){
            if(min != arr[i]){
                answer[num] = arr[i];
                num++;
            }
        }
        
        return answer;

    }
}