/**
 * Created by jeffr on 24-06-2017.
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        if(grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
//        boolean visited[][] = new boolean[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j]==1) {
                    sum += checkPosition(i , j - 1, grid) + checkPosition(i-1, j , grid) +
                            checkPosition(i, j + 1, grid) + checkPosition(i + 1, j, grid);
                }
            }
        }
        return sum;
    }
    int checkPosition(int i,int j,int[][] grid) {
        int flag = 0;
        if(i < 0 || i>= grid.length || j<0 || j>=grid[0].length) {
            flag = 1;
        } else {
            if(grid[i][j] == 0 )
                flag = 1;
        }
        return flag;
    }
    public static void main (String args[]) {
        IslandPerimeter i = new IslandPerimeter();
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};
        System.out.println(i.islandPerimeter(grid));
    }
}
