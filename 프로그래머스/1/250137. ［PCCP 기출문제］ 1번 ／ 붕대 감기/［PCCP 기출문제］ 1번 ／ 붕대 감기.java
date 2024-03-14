import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        // bandage[시전시간, 초당 회복량, 추가 회복량]
        // 최대체력 health
        // attacks[몬스터 공격시간, 피해량]
        // 공격이 끝난 후 남은체력 return, 0이하라면 -1 return
        
        // 공격 받으면 기술이 취소 당함, 공격당하는중은 회복x
        
        Map<Integer, Integer> attackmap = new HashMap<>();
        int maxtime = 0;
        int count = 0;
        int needcount = bandage[0];
        int heal = bandage[1];
        int plusheal = bandage[2];
        int maxhealth = health;
        
        for (int i = 0; i < attacks.length; i++) {
            attackmap.put(attacks[i][0], attacks[i][1]);
            maxtime = Math.max(maxtime, attacks[i][0]);
        }
        
        for (int i = 1; i <= maxtime; i++) {
            if (attackmap.get(i) == null) {
                health += heal;
                count ++;
                
                if (count == needcount) {
                    health += plusheal;
                    count = 0;
                }
                
                if (health >= maxhealth) {
                    health = maxhealth;
                }
                
            } else {
                health -= attackmap.get(i);
                count = 0;
                
                if (health <= 0) {
                    health = -1;
                    break;
                }
            }
        }
        
        return health;
    }
}