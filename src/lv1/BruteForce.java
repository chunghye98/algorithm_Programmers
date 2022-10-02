package lv1;

public class BruteForce {
    public int solution(int[][] sizes) {
        int iMax = 0;
        int jMax = 0;
        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);
            iMax = Math.max(iMax, width);
            jMax = Math.max(jMax, height);
        }
        return iMax * jMax;
    }
}
