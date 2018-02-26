package lc.medium;

/**
 * Created by jeffr on 07-11-2017.
 */
public class ContainerWater {
    public int maxArea(int[] height) {
        if(height.length < 2) {
            return -1;
        }
        int l=0;
        int r=height.length -1;
        int maxArea = 0;
        while(l < r) {
            int area = Math.min(height[l],height[r]) * (r-l);
            System.out.println(Math.min(height[l],height[r]));
            System.out.println("area:: "+area);
            maxArea = (maxArea < area)? area:maxArea;
            if(height[r] > height[l]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
