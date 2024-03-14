import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] dog = {0, 0};
        int movePoint = 0;
        boolean isblock = false;
        int newx = 0;
        int newy = 0;
        
        // 시작점 찾기
        for (int i=0; i<park.length; i++) {
            for (int j=0; j<park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    dog[0] = i;
                    dog[1] = j;
                }
            }
        }
        // 조건
        // park배열의 크기 벗어나면 해당명령무시하고 넘어감
        // 장애물이있으면 해당명령무시하고 넘어감
        // [y,x]
        for (String s : routes) {
            isblock = false;
            int move = Integer.valueOf(s.substring(2));
            switch (s.charAt(0)) {
                case 'E' : 
                    // 이동지점이 park를 벗어나는지 검사
                    newx = dog[1] + move;
                    if (newx >= park[0].length()) {
                        isblock = true;
                        break;
                    }
                    // 이동중에 장애물을 만나는지 검사
                    for (int i = dog[1]; i <= newx; i++) {
                        if (park[dog[0]].charAt(i) == 'X') {
                            isblock = true;
                            break;
                        }
                    }
                    break;
                case 'W' : 
                    // 이동지점이 park를 벗어나는지 검사
                    newx = dog[1] - move;
                    if (newx < 0) {
                        isblock = true;
                        break;
                    }
                    // 이동중에 장애물을 만나는지 검사
                    for (int i = dog[1]; i >= newx; i--) {
                        if (park[dog[0]].charAt(i) == 'X') {
                            isblock = true;
                            break;
                        }
                    }
                    break;
                case 'N' : 
                    // 이동지점이 park를 벗어나는지 검사
                    newy = dog[0] - move;
                    if (newy < 0) {
                        isblock = true;
                        break;
                    }
                    // 이동중에 장애물을 만나는지 검사
                    for (int i = dog[0]; i >= newy; i--) {
                        if (park[i].charAt(dog[1]) == 'X') {
                            isblock = true;
                            break;
                        }
                    }
                    break;
                case 'S' : 
                    // 이동지점이 park를 벗어나는지 검사
                    newy = dog[0] + move;
                    if (newy >= park.length) {
                        isblock = true;
                        break;
                    }
                    // 이동중에 장애물을 만나는지 검사
                    for (int i = dog[0]; i <= newy; i++) {
                        if (park[i].charAt(dog[1]) == 'X') {
                            isblock = true;
                            break;
                        }
                    }
                    break;
            }
          
            // 이동 가능한 경우에만 좌표 업데이트
            if (!isblock) {
                if (s.charAt(0) == 'E' || s.charAt(0) == 'W') {
                    dog[1] = newx;
                } else {
                    dog[0] = newy;
                }
            }
        }
        return dog;
    }
    

}