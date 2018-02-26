package hr;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by jeffr on 02-10-2017.
 */
public class ArmstrongNumber {
    public boolean isArmstrongNumber(int n) {
        boolean result=false;
        int input = n;
        int sum = 0;
        while(n > 0) {
            int val = n%10;
            System.out.println("val::"+val);
            sum+= val*val*val;
            n = n/10;
        }
        System.out.println("sum::"+sum+";n::"+input);
        if(sum == input) {
            result = true;
        }
        return result;
    }

}
