package lc.medium;

import java.util.Arrays;

/**
 * Created by jeffr on 26-09-2017.
 */
public class FriendCircles {
    public int findCircleNum(int[][] M) {
        int[] parent = new int[M.length];
        Arrays.fill(parent,-1);
        int count = M.length;
        for(int r=0;r<M.length;r++) {
            for(int c=1+r;c < M.length;c++) {


                if(M[r][c] == 1 && (parent[r] ==-1 || parent[c] ==-1)) {
                    System.out.println("("+r+":"+c+")");
                    parent[c] = r;
                    parent[r] = c;
                    count--;
                }

            }
        }

        System.out.println("count:: "+count);

        return count;
    }
}
