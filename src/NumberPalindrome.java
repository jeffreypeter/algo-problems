import java.util.ArrayList;

/**
 * Created by jeffr on 21-06-2017.
 */
public class NumberPalindrome {
    public boolean isPalindrome(int x) {
        System.out.println(">>>>>>>>" +x);
        int v;
        if(x < 0)
            v = x * -1;

        else
            v = x;
        ArrayList<Integer> lst = new ArrayList<Integer>();
        while (v !=0) {
            int c = v%10;
            lst.add(c);
            v = v/10;
        }
        if(lst.size() <= 1) {
            return true;
        }
        System.out.println(lst.size());
        if(lst.size()%2 == 0) {
            int a =lst.size()/2 - 1;
            int b = a + 1;
            while(a>=0 && b <lst.size()) {
                if(lst.get(a) != lst.get(b)) return false;
                a--;
                b++;
            }
            return true;
        } else {
            int a =lst.size()/2;
            int b = a;
            while(a>=0 && b <lst.size()) {
                if(lst.get(a) != lst.get(b)) return false;
                a--;
                b++;
            }
            return true;
        }
    }
    public static void main(String args[]) {
        NumberPalindrome n = new NumberPalindrome();
        System.out.println(n.isPalindrome(0));
        System.out.println(n.isPalindrome(1));
        System.out.println(n.isPalindrome(4115));
        System.out.println(n.isPalindrome(1223221));
        System.out.println(n.isPalindrome(123321));
        System.out.println(n.isPalindrome(-2147447412));
        System.out.println(n.isPalindrome(-214717412));
        System.out.println(n.isPalindrome(-214712412));





    }
}
