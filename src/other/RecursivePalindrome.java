package other;

/**
 * Created by jeffr on 02-10-2017.
 */
public class RecursivePalindrome {
    int reverseNum(int n) {
        int sum = 0;
        while(n > 0) {
            int val = n%10;
            sum=sum*10+val;
            n/=10;
        }
        return sum;
    }
    public int pathPalindrome(int n) {
        int itr = 0;
        while(n != reverseNum(n)) {

            n+=reverseNum(n);
            System.out.println("n:: "+n+";Reverse"+reverseNum(n));
            itr++;
            if(itr == 10) {
                break;
            }
        }
        return itr;
    }
}
