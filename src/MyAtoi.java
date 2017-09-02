/**
 * Created by jeffr on 21-06-2017.
 */
public class MyAtoi {
    public int myAtoi(String str) {
        System.out.println(">>>>>>>>"+str);
        boolean init = true;
        boolean neg = false;
        int result = 0;
        for(int i=0;i<str.length();i++) {

            int ac = str.charAt(i);
//            System.out.print(">>"+ac);
            if(ac == 43) {
                if(init) {
                    init=false;
                    continue;
                } else {
                    break;
                }
            } else  if(ac == 45) {
                if(init) {
                    init=false;
                    neg = true;
                    continue;
                } else {
                    break;
                }
            } else if(ac == 32) {
                if(init) {
                    continue;
                } else {
                    break;
                }
            } else if( ac >=48 && ac <=57 ) {
                init = false;
                int num = (ac - 48);

                int temp = result;
                result = result * 10 - num;
                int new_result = (result + num)/10;
                System.out.println(i+" <> "+result);
                if(!neg && (result == Integer.MIN_VALUE || temp != new_result || result > 0)) {
                    return  Integer.MAX_VALUE;
                } else if (neg && (temp != new_result || result > 0)) {
                    return  Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }
        return (neg)?result:result * -1;
    }
    public static void main(String args[] ){
        MyAtoi a = new MyAtoi();
        System.out.println(a.myAtoi(" "));
        System.out.println(a.myAtoi("191"));
        System.out.println(a.myAtoi("19+1"));
        System.out.println(a.myAtoi("-191"));
        System.out.println(a.myAtoi(" 191"));
        System.out.println(a.myAtoi(" 1 91"));
        System.out.println(a.myAtoi("+2147483647"));
        System.out.println(a.myAtoi("+2147483648"));
        System.out.println(a.myAtoi("-2147483648"));
        System.out.println(a.myAtoi("-+191"));
        System.out.println(a.myAtoi("-2147483649"));
        System.out.println(a.myAtoi("    10522545459"));

    }
}
