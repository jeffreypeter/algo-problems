import java.util.Arrays;

/**
 * Created by jeffr on 07-08-2017.
 */
public class ReverseWords {
    public String reverseWords(String s) {

        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arr.length;i++) {
            StringBuilder temp = new StringBuilder(arr[i]);
            temp.reverse();
            sb.append(temp);
            if(i!=arr.length-1) {
                sb.append(" ");
            }
        }
        System.out.println(Arrays.toString(arr));
        return sb.toString();
    }
    public static void main(String args[]) {
        ReverseWords ri = new ReverseWords();
        System.out.println(ri.reverseWords("Let's"));
    }
}
