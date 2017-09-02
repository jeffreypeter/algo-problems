import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jeffr on 22-07-2017.
 */
public class GameOfLife {
    public void gameOfLife(int[][] board) {

        if(board.length == 0) {
            return;
        }
        if(board[0].length == 0) {
            return;
        }
        Integer[][] nextGen = new Integer[board.length][board[0].length];
        for(int r = 0;r<board.length;r++) {
            for(int c =0;c<board[0].length;c++) {
                int nCount[] = countNStatus(r,c,board);
                System.out.println(Arrays.toString(nCount));
                if(board[r][c] == 1) {
                    if (nCount[1] < 2 || nCount[1] > 3) {
                        nextGen[r][c] =0;
                    } else if(nCount[1] == 2 || nCount[1] == 3) {
                        nextGen[r][c] = 1;
                    }
                } else {
                    if(nCount[1] == 3) {
                        nextGen[r][c] = 1;
                    } else {
                        nextGen[r][c] = 0;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(nextGen));
        for(int r = 0;r<board.length;r++) {
            for(int c =0;c<board[0].length;c++) {
                board[r][c] = nextGen[r][c];
            }
        }
        // return nextGen;
    }
    private int[] countNStatus(int r, int c,int[][] board) {
        System.out.println(r +" "+c);
        int nCount [] = {0,0};
        for(int nr = r-1;nr<=r+1; nr++ ){
            if(nr < 0 || nr > board.length-1) {
                continue;
            }
            for(int nc=c-1;nc<=c+1;nc++) {
                if(nc < 0 || nc > board[0].length-1) {
                    continue;
                }
                if(nc == c && nr == r ) {
                    continue;
                }

                int val = board[nr][nc];
                //System.out.println("val: "+val);
                if(val == 0) {
                    nCount[0]++;
                } else {
                    nCount[1]++;
                }
            }
        }
        return nCount;
    }



    public static void main(String args[]) {
        GameOfLife g = new GameOfLife();
        int[][] a = {{1,1},{1,0}};
        g.gameOfLife(a);
    }
}
