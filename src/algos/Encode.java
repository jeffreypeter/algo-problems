package algos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by jeffr on 09-11-2017.
 */
public class Encode {

    private final int CHAR_RANGE_COUNT = 32;
    private int sum;
    private int validChar;
    private class HuffmanTreeNode {
        int frequency;
        char c;
        HuffmanTreeNode left;
        HuffmanTreeNode right;
        HuffmanTreeNode() {

        }
        HuffmanTreeNode(int frequency,HuffmanTreeNode left, HuffmanTreeNode right) {
            this.frequency = frequency;
            this.left = left;
            this.right = right;
//            System.out.println(left.frequency + " "+ right.frequency);
        }
    }
    private void decode(HuffmanTreeNode tree) {
        HashMap<Character,String> code = new HashMap();
        printCode(tree,"",code);
    }
    void printCode(HuffmanTreeNode node,String temp, HashMap<Character,String> code) {
        // Base Condition
        if(node.left == null && node.right == null) {
            System.out.println(node.c+"\t"+node.frequency+"\t"+temp);
            this.sum=this.sum+(node.frequency * temp.length());
//            System.out.println(this.sum);
            return;
        }
        printCode(node.left,temp+"0",code);
        printCode(node.right,temp+"1",code);
    }
    private HuffmanTreeNode buildTree(HashMap<Character,Integer> map) {
        PriorityQueue<HuffmanTreeNode> pq = new PriorityQueue<>(map.size()
                , new Comparator<HuffmanTreeNode>() {
            @Override
            public int compare(HuffmanTreeNode o1, HuffmanTreeNode o2) {
                Integer value1 = new Integer(o1.frequency);
                Integer value2 = new Integer(o2.frequency);
                return value1.compareTo(value2);
            }
        });

        for(char c:map.keySet()) {
            HuffmanTreeNode node = new HuffmanTreeNode();
            node.frequency = map.get(c);
            node.c = c;
            pq.add(node);
        }
        while(pq.size() > 1) {
            HuffmanTreeNode left = pq.poll();
            HuffmanTreeNode right = pq.poll();
            pq.offer(new HuffmanTreeNode((left.frequency+right.frequency),left,right));
        }
        return pq.poll();
    }
    private HashMap<Character,Integer> readFile() {
        BufferedReader br = null;
        FileReader fr = null;
        String FILENAME="E:\\Box Sync\\IUB Course\\Semester III\\Algos\\Assignment\\Programming\\PA4\\55917-0.txt";
        HashMap<Character,Integer> charMap = new HashMap<>();
        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
//            String line="lorem ipsum dolor sit amet, consectetur adipiscing elit. sed et tortor metus. sed at luctus lorem. vivamus faucibus ipsum in diam aliquet, at suscipit augue posuere!";
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                for(int i=0;i<line.length();i++) {
                    char c = line.charAt(i);
                    if((c >= 97 && c <=122) || c == 32 || c == 46 || c == 44 || c == 33 || c == 63 || c==39 ) {
                        if(charMap.get(c) == null) {
                            charMap.put(c,1);
                        } else {
                            charMap.put(c,charMap.get(c)+1);
                        }
                        this.validChar = this.validChar + 1;
                    }

                }
            }
            System.out.println(charMap);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();

            }
        }
        return charMap;
    }
    public static void main(String args[]) {
        Encode e = new Encode();
        HashMap<Character,Integer> map = e.readFile();
        HuffmanTreeNode tree = e.buildTree(map);
        e.decode(tree);
        System.out.println("Number of characters chosen: "+e.CHAR_RANGE_COUNT);
        System.out.println("This text is encode using "+e.sum+" bytes");
        System.out.println("Valid Characters:: "+e.validChar);
        System.out.println("Equal Bits(5-bits) would have used  "+e.validChar*5+" bytes");
        System.out.println("We have saved "+(e.validChar*5 - e.sum)+" bytes" );
    }

}
