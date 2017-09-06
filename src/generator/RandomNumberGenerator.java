package generator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by jeffr on 05-09-2017.
 */
public class RandomNumberGenerator {

    public static void generateRandomNumberFile(int count,String fileName) {
        System.out.println("IN::generateRandomNumberFile::: count::"+count+";fileName:: "+fileName);
        Random rand = new Random();
        try{
            PrintWriter writer = new PrintWriter("/algo-data/random/"+fileName, "UTF-8");
            for(int i=0;i<count;i++) {
                int  n = rand.nextInt(Integer.MAX_VALUE);
//                System.out.println(n);
                writer.println(Integer.toString(n));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        /*for(int i=2000;i<=50000;i=i+2000) {
            generateRandomNumberFile(i,Integer.toString(i));
        }*/
        int i =100;
        generateRandomNumberFile(i,Integer.toString(i));

    }
}
