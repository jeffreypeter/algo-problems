/**
 * Created by jeffr on 18-06-2017.
 */
public class ReverseInteger {
    public int reverse(int x) {
        if(x >= 0) {
            StringBuilder sb = new StringBuilder(Integer.toString(x));
            sb.reverse();
            Double val = Double.parseDouble(sb.toString());
            if (val <= Integer.MAX_VALUE ) {
                return Integer.parseInt(sb.toString());
            } else {
                return 0;
            }
        } else {
            String temp = Integer.toString(x);
            StringBuilder sb = new StringBuilder( temp.substring(1,temp.length()));
            sb.reverse();
            sb.insert(0,"-");
            Double val = Double.parseDouble(sb.toString());
            if(val >= Integer.MIN_VALUE) {
                return Integer.parseInt(sb.toString());
            } else {
                return 0;
            }

        }
    }
    public static void main(String args[]) {
//        ReverseInteger ri = new ReverseInteger();
//        System.out.println(ri.reverse(123));
//        System.out.println(ri.reverse(-123));
        int x = -123;
        System.out.println(x%10);
    }
}
