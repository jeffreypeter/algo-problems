package generator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    /**
     * Generates the datapoints till count and shuffles them
     * @param count
     * @return
     */
    public static List<String> generateShuffleNumber(int count,boolean shuffle) {
        System.out.println("IN:: generateShuffleNumber::: count::"+count);
        List<String> list = new ArrayList<>();
        try {
           /* for (int i = 1; i <= count; i++) {
                list.add(Integer.toString(i));
            }*/
            for (int i = count; i > 0; i--) {
                list.add(Integer.toString(i));
            }
            /**
             * Randomizes the list
             */
            if(shuffle)
                Collections.shuffle(list);
        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static void writeListFile(List<String> list,String fileName) {
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            System.out.println(list.size());
            for(String data:list) {
                writer.println(data);
            }
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void orchestrate(String type,int start, int end, int inc, int itr) {
        boolean shuffle =false;
        if("r".equalsIgnoreCase(type)) {
            shuffle = true;
        }
        String outputDir="/algo-data/random/"+type;
        for(int i=start;i<=end;i=i+inc) {
            for(int j=0;j<itr;j++) {
                writeListFile(generateShuffleNumber(i,shuffle),outputDir+"-"+Integer.toString(i)+"-"+j);
            }
        }
    }
    public static void main(String[] args) {
//        orchestrate("r",500,25000,500,10);
//        orchestrate("a",500,25000,500,1);
        orchestrate("d",500,25000,500,1);
    }
}
