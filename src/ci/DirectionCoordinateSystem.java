package ci;

/**
 * Created by jeffr on 02-10-2017.
 */
public class DirectionCoordinateSystem {
    public String findDirection(int[] refer, int[] pnt) {
        int x = pnt[0] - refer[0];
        int y = pnt[1] - refer[1];
        StringBuilder sb = new StringBuilder();
        if(x > 0) {
            sb.append("N");
        } else {
            sb.append("S");
        }
        if(y > 0 ) {
            sb.append("E");
        } else {
            sb.append("W");
        }
        if(sb.length() <= 0) {
            sb.append("P");
        }
        return sb.toString();
    }
}
