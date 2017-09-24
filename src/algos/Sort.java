package algos;


import java.io.*;

/**
 * Created by jeffr on 02-09-2017.
 * To run the program please create the directories - inputDir,outputDir
 *
 */
public class Sort {

    static String inputDir = "/algo-data/random/";
    static String  outputDir = "/algo-data/output/";

    private static int selectPivot(int[] nums,int lower, int higher) {

        return nums[(lower+higher)/2];
//        return nums[lower];
    }
    private static int split(int[] nums,int lower,int higer, int pivot) {
        while (lower <= higer) {
            // Moving from the lower till we get element bigger than pivot
            while (nums[lower] < pivot) {
                lower++;
            }
            // Moving from the higher end till we get element that is smaller than pivot
            while (nums[higer] > pivot) {
                higer--;
            }
            //
            if(lower <= higer) {
                int temp = nums[lower];
                nums[lower] = nums[higer];
                nums[higer] = temp;
                lower++;
                higer--;
            }
        }
        return lower;
    }

    private static void quickSortRecursive(int[] nums,int lower, int higher) {
        //Base Recursive Condition
        if(lower >= higher) {
            return;
        }
        // Choosing pivot
        int pivot = selectPivot(nums,lower,higher);
        int middle = split(nums,lower,higher,pivot);
        quickSortRecursive(nums,lower,middle -1);
        quickSortRecursive(nums,middle,higher);
    }
    public static int[] quickSort(int[] nums) {
        quickSortRecursive(nums,0,nums.length -1 );
        return nums;
    }
    public static void merge(int[] nums,int[] temp,int lowerStart, int middle,int higherEnd) {

        int lower = lowerStart;
        int index = lowerStart;
        int higher = middle + 1;
        while(lower <=middle && higher<=higherEnd) {
            if(nums[lower] <= nums[higher]) {
                temp[index] = nums[lower];
                lower++;
            } else {
                temp[index] = nums[higher];
                higher++;
            }
            index++;
        }
        // One of the below statement is required to move remaining content - when the above content terminates
        System.arraycopy(nums,lower,temp,index,middle - lower + 1);//src, src_pos, des, des_pos, size
        System.arraycopy(nums,higher,temp,index, higherEnd - higher + 1);
        // Finally copying into the from temp to our result
        System.arraycopy(temp,lowerStart,nums,lowerStart,higherEnd -lowerStart +1);
    }
    public  static void mergeSortRecursive(int[] nums,int[] temp,int lowerStart, int higherEnd) {
        //Base Recursive Condition
        if(lowerStart >= higherEnd) {
            return;
        }
        else {
            int middle = (lowerStart + higherEnd) / 2;
            mergeSortRecursive(nums,temp,lowerStart,middle);
            mergeSortRecursive(nums,temp,middle+1,higherEnd);
            merge(nums,temp,lowerStart,middle,higherEnd);
        }
    }
    public static int[] mergeSort(int[] nums) {
//        System.out.println(Arrays.toString(nums));
        mergeSortRecursive(nums,new int[nums.length],0,nums.length -1);
        return nums;
    }
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
        int count = Integer.parseInt(fileName.split("-")[1]);
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

    /**
     *
     * @param init - refers start of data input
     * @param limit - refers end of data input
     * @param inputType - r: Random, a: ascending(Non Increasing), d: decreasing(Non Decreasing)
     * @param sortType - bubbleSort, insertionSort
     * @param itr - No of times the each sort has to be repeated
     */
    public static void orchestrate(int init,int limit,String inputType, String sortType,int itr) {
        try {
            String reportTime = ""+System.currentTimeMillis();
            String report ="/algo-data/"+sortType+"-"+inputType+"-"+reportTime ;
            PrintWriter writer = new PrintWriter(report, "UTF-8");

            for(int i =init;i<=limit;i=i+init) {
                int sum=0;
                String fileName = Integer.toString(i);
                int[] output = new int[i];
                for(int j=0;j<itr;j++) {
                    int[] input = readInputDataFile(inputDir ,inputType+"-"+fileName+"-"+j);
//                    long start = System.currentTimeMillis();
                    double start = System.nanoTime();
                    if("bubbleSort".equalsIgnoreCase(sortType)) {
                        output = bubbleSort(input);
                    } else if("insertionSort".equalsIgnoreCase(sortType)){
                        output = insertionSort(input);
                    } else if ("quickSort".equalsIgnoreCase(sortType)) {
                        output = quickSort(input);
                    } else {
                        output = mergeSort(input);
                    }
//                    long time = System.currentTimeMillis() - start;
                    double time = System.nanoTime() - start;
                    sum+=time;
                    writer.println(sortType+"-"+inputType+"-"+j+";"+fileName +";"+time);
                    writeOutputDataFile(outputDir,sortType+"-"+inputType+"-"+fileName+"-"+j,output);
                }
                System.out.println(sortType+"-"+inputType+","+fileName +","+(sum/itr));

            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        /***
         * please create the directories - inputDir,outputDir and have the input values to run the program
         */
        /*orchestrate(2000,50000,"r","bubbleSort",10);
        orchestrate(2000,50000,"a","bubbleSort",1);
        orchestrate(2000,50000,"d","bubbleSort",1);*/

//        orchestrate(500,25000,"r","insertionSort",10);
//        orchestrate(500,25000,"a","insertionSort",1);
//        orchestrate(500,25000,"d","insertionSort",1);

//        orchestrate(500,25000,"r","mergeSort",10);
//        orchestrate(500,25000,"a","mergeSort",1);
//        orchestrate(500,25000,"d","mergeSort",1);
//
//        System.out.println("\n\n");
        orchestrate(500,25000,"r","quickSort",10);
//        orchestrate(500,25000,"a","quickSort",1);
//        orchestrate(500,25000,"d","quickSort",1);


    }
}
