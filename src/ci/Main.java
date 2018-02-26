package ci;

import java.util.Arrays;

/**
 * Created by jeffr on 03-10-2017.
 */
public class Main {


    private int[] stack;
    private int top;
    private int size;

    public Main(int s) {
        top = -1;
        size = s;
        stack = new int[size];
    }

    public void push(int val) {
        stack[++top] = val;
    }

    public long pop() {
        return stack[top--];
    }

    public static void main(String args[]) {
        String line = "1 2 3 4";
        String[] inputs = line.split(" ");
        Main main = new Main(inputs.length);

        for(String input: inputs) {
            int val = Integer.parseInt(input);
            main.push(val);
        }
        int j=0;
        while (main.top != -1) {
//            System.out.println(j);
            if(j%2==0) {
                System.out.println(" "+main.pop());
            } else {
                main.pop();
            }

            j++;
        }
    }
}
