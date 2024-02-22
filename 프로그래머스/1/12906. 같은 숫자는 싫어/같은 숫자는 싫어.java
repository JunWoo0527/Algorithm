import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        // 연속해서 나오는 같은수는 중복제거
        // 단, 반환시 순서 중요
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i]) {
                continue;
            }
            arrl.add(arr[i]);
        }
        
        int[] arri = new int[arrl.size()];
        
        for(int i = 0; i < arrl.size(); i++) {
            arri[i] = Integer.valueOf(arrl.get(i).toString());
        }

        return arri;


    }
}