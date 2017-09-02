package cci.arraysandstring;

/**
 * Created by jeffr on 22-08-2017.
 */
public class IsUnique {

    public boolean checkUnique(String input) {
        boolean[] map = new boolean[256];
        boolean result = true;
        for(int i=0;i<input.length();i++) {
            int charA = input.charAt(i);
            if(!map[charA]) {
                map[charA] = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
