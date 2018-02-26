package ci;

/**
 * Created by jeffr on 02-10-2017.
 */
public class StringCompress {
    public String compressString(char[] a) {
        int i =1;
        char current= a[0];
        StringBuilder sb = new StringBuilder();
        int temp=1;
        while(i < a.length ) {
            if(current == a[i]) {
                temp++;
            } else {
//                if(temp == 1) {
////                    sb.append();
//                    sb.append(current);
//                } else {
                    sb.append(current);
                    sb.append(temp);
//                }
                current = a[i];
                temp = 1;
            }
            i++;
        }
        sb.append(current);
        sb.append(temp);
        return sb.toString();
    }
}
