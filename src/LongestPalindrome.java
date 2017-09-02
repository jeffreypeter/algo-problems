/**
 * Created by jeffr on 17-06-2017.
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        System.out.println("Test:: "+s);
       String b = null;
       int i = 0;
       int m = 0;

       if(s.length() == 1) {
           return s;
       }
       if(s.length() == 2) {
           if(s.charAt(0) == s.charAt(1)) {
               return s;
           } else {
               return s.charAt(0)+"";
           }
       }
        while(i < s.length() - 1) {
           int x = i;
           int y = i+1;

            if( s.charAt(x) == s.charAt(y)) {

                while(x >= 0 && y <s.length()) {
                    if(s.charAt(x) == s.charAt(y)) {
                        if(m < (y - x +1)) {
                            b = s.substring(x, y+1);
//                            System.out.println(b);
                            m = b.length();
                        }
                        x--;
                        y++;
                    } else {
                        break;
                    }
                }
            }
            if (i < s.length() - 2) {
                int w = i;
                int z = i + 2;
                if( s.charAt(w) == s.charAt(z)) {
                    while(w >= 0 && z <s.length()) {
                        if(s.charAt(w) == s.charAt(z)) {
                            if(m < (z - w +1)) {
                                b = s.substring(w, z+1);
//                                System.out.println(b);
                                m = b.length();
                            }
                            w--;
                            z++;
                        } else {
                            break;
                        }
                    }
                }

            }
            i++;
        }
        if(b == null) {
            return s.charAt(0)+"";
        }
        return b;
    }

    public static void main(String args[]) {
        LongestPalindrome lp = new LongestPalindrome();
//        System.out.println("Result:: " + lp.longestPalindrome("a"));
//        System.out.println("Result:: " + lp.longestPalindrome("aa"));
//        System.out.println("Result:: " + lp.longestPalindrome("abba"));
//        System.out.println("Result:: " + lp.longestPalindrome("aBB"));
//        System.out.println("Result:: " + lp.longestPalindrome("aBa"));
//        System.out.println("Result:: " + lp.longestPalindrome("aBdBagg"));
        System.out.println("Result:: " + lp.longestPalindrome("abcdw"));
//        System.out.println("Result:: " + lp.longestPalindrome("xzaBdBagfgaB"));
//        System.out.println("Result:: " + lp.longestPalindrome("ababab"));
//        System.out.println("Result:: " + lp.longestPalindrome("aamnecaaceo"));

    }
}
