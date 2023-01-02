import java.util.List;

class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int maxArea = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                if (height[i] <= height[j]) area = height[i] * (j - i);
                else area = height[j] * (j - i);
                if (maxArea < area) maxArea = area;

            }
        }

        return maxArea;

    }
}
