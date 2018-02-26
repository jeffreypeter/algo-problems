package algos;

/**
 * Created by jeffr on 04-10-2017.
 */
public class NSum {

    /**
     * @param input >= 10^5
     */
    public static void findWays(int input) {
        int[] memo = new int[input+3]; // Adjusted to prevent array bounds Exception
        memo[0] = memo[1] = memo [2] = 1;
        memo[3] = 2;
        if(input > 4 ) {
            for(int i = 4; i <= input; i++) {
                // Restricting the output size based on the Piazza announcement
                memo[i] = (memo[i-1] + memo[i-3] + memo[i-4]) % 100000;
            }
        }
        System.out.println("Input::"+input+";Output::"+memo[input]);
    }
    public static void main(String[] args) {
        int inputs[] = {1,2,3,50,100,200,1000,100000,100100,100200,100300,100400,100500};
        for(int input:inputs) {
            findWays(input);
        }
    }
}
