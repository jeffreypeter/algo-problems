package algos;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jeffr on 02-09-2017.
 */
public class Sort {

    public static int[] bubbleSort(int[] nums) {
        for(int i=0; i < nums.length; i++){
            for(int j=1; j < (nums.length-i); j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    public static int[] insertionSort(int[] nums) {
        for(int i=1;i < nums.length;i++) {
            int key = nums[i];
            for(int j=i-1;j >=0 && nums[j] > key; j--) {
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
        return nums;
    }
    public static int[] readInputDataFile(String dir,String fileName) {
        int count = Integer.parseInt(fileName);
        int input[] = new int[count];
        int i =-1;
        try (BufferedReader br = new BufferedReader(new FileReader(dir+fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
//                System.out.println(line);
                input[++i]=Integer.parseInt(line);
            }
//            System.out.println(Arrays.toString(input));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public static void writeOutputDataFile(String dir,String fileName, int[] output) {

        try {
            PrintWriter writer = new PrintWriter(dir+fileName, "UTF-8");
            for(int i=0;i<output.length;i++) {
                writer.println(output[i]);
            }
            writer.close();
            /*PrintWriter writerReverse = new PrintWriter(dir+"r"+fileName, "UTF-8");
            for(int j=output.length-1;j>=0;j--) {
                writerReverse.println(output[j]);
            }
            writerReverse.close();*/

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String args[]) {

        String inputDir = "/algo-data/random/";
        String  outputDir = "/algo-data/output/";
        String type= "randomIp";

        try {
            String reportTime = ""+System.currentTimeMillis();
            int limit = 50000;
            int init = 2000;
            String report ="/algo-data/"+type+"-bubbleSort-"+reportTime ;
            PrintWriter writer = new PrintWriter(report, "UTF-8");
            for(int i =init;i<=limit;i=i+2000) {
                String fileName = Integer.toString(i);
                int[] output = new int[i];
                for(int j=0;j<10;j++) {
                    int[] input = readInputDataFile(inputDir ,fileName);
                    long start = System.currentTimeMillis();
                    output = bubbleSort(input);
                    long time = System.currentTimeMillis() - start;
                    writer.println("bubbleSort;"+j+";"+fileName +";"+time);
                    System.out.println("bubbleSort;"+j+";"+fileName +";"+time);
                }
                writeOutputDataFile(outputDir,"bubble-"+fileName,output);
            }
            writer.close();
            report ="/algo-data/"+type+"-insertionSort-"+reportTime ;
            writer = new PrintWriter(report, "UTF-8");
            for(int i =init;i<=limit;i=i+2000) {
                String fileName = Integer.toString(i);
                int[] output = new int[i];
                for(int j=0;j<10;j++) {
                    int[] input = readInputDataFile(inputDir ,fileName);
                    long start = System.currentTimeMillis();
                    output = insertionSort(input);
                    long time = System.currentTimeMillis() - start;
                    writer.println("insertionSort;"+j+";"+fileName +";"+time);
                    System.out.println("insertionSort;"+j+";"+fileName +";"+time);
                }
                writeOutputDataFile(outputDir,fileName,output);
            }


            writer.close();


            //System.out.println(Arrays.toString(output));
        } catch (Exception e) {

        }


    }
}
