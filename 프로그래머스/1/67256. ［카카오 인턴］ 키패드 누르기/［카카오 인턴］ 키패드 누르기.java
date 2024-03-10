class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int leftHand = 10;
        int rightHand = 12;
        
        for (int number : numbers) {
            if (number == 0) {
                number = 11;
            }
            
            switch (number % 3) {
                case 1:
                    leftHand = number;
                    answer += "L";
                    break;
                case 0:
                    rightHand = number;
                    answer += "R";
                    break;
                case 2:
                    int ldistance = Math.abs(number - leftHand);
                    int rdistance = Math.abs(number - rightHand);
                    
                    ldistance = (ldistance / 3) + (ldistance % 3);
                    rdistance = (rdistance / 3) + (rdistance % 3);
                    
                    if (ldistance < rdistance) {
                        leftHand = number;
                        answer += "L";
                    } else if (ldistance > rdistance) {
                        rightHand = number;
                        answer += "R";
                    } else {
                        if (hand.equals("left")) {
                            leftHand = number;
                            answer += "L";
                        } else {
                            rightHand = number;
                            answer += "R";
                        }
                    }
                    break;
            }
        }
        return answer;
    }
}