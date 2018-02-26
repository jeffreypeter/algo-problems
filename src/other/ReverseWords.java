package other;

/**
 * Created by jeffr on 09-10-2017.
 */
public class ReverseWords {
    public static void main(String args[]) {
        String input = "hello world   test";
        String[] arr = input.split( " ");
        char[] s = new char[input.length()];
        System.out.println(arr.length);
        int count = 0;
        for(String word: arr) {
            for(int j=word.length()-1;j>=0;j--) {
                s[count++] = word.charAt(j);
            }
            if(count != input.length())
                s[count++] = ' ';
        }
        String output = String.valueOf(s);
        System.out.println(output);
    }
}
