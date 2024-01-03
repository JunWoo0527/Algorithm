class Solution {
    public int[] solution(String[] wallpaper) {
        int minx = 50;
        int miny = 50;
        int maxx = 0;
        int maxy = 0;
        
        for(int i=0; i<wallpaper.length; i++) {
            int sj = wallpaper[i].indexOf("#");
            int lj = wallpaper[i].lastIndexOf("#");
            if(sj == -1) {
                continue;
            }
            minx = Math.min(minx, i);
            miny = Math.min(miny, sj);
            maxx = Math.max(maxx, i);
            maxy = Math.max(maxy, lj);
        }
        
        int[] answer = {minx, miny, maxx+1, maxy+1};
        
        
        return answer;
    }
}