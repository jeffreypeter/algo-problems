import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jeffr on 07-07-2017.
 */
public class BinaryWatch {
    Map<Integer,ArrayList<Integer>> hMap = new HashMap<>();
    Map<Integer,ArrayList<Integer>> mMap = new HashMap<>();
    public List<String> readBinaryWatch(int num) {

        generateCount(11, hMap);
        generateCount(59, mMap);
        System.out.println("num:: "+num);
        ArrayList<String> result = new ArrayList<>();
        if(num < 0 || num > 10 ) return result;
        if(num == 0) {
            result.add("0:00");
        } else {
            //Start
            int h = num ,m = 0;

            if(num > 3) {
                h = 3; m = num -h;
            }
            while(m <= num && m <= 4 ) {
                System.out.println("h:: "+ h+" "+"m::"+m);
                mixMatch(h,m,result);
                if(h != 0) h--;
                m++;

            }


        }

        return result;
    }

    public void mixMatch(int h, int m, ArrayList<String> result) {
        for(int i =0 ;i < hMap.get(h).size();i++) {
            for(int j=0;j < mMap.get(m).size();j++) {
                String str = hMap.get(h).get(i) + ":" + String.format("%02d", mMap.get(m).get(j));
                result.add(str);
            }
        }

    }
    public void generateCount(int n, Map<Integer,ArrayList<Integer>> map){

        for(int i=0;i<=n;i++) {
            String h = Integer.toBinaryString(i);
//            System.out.println(h);
            int count = h.length() - h.replace("1", "").length();
            if(map.containsKey(count)) {
                map.get(count).add(i);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(count,temp);
            }
        }
        System.out.println(map);

    }

    public static void main (String args[]) {
        BinaryWatch bw = new BinaryWatch();

//        System.out.println(bw.readBinaryWatch(11));
        System.out.println(bw.readBinaryWatch(5));
//        System.out.println(bw.readBinaryWatch(1));
//        System.out.println(bw.readBinaryWatch(3));
//        System.out.println(bw.readBinaryWatch(4));
//        System.out.println(bw.readBinaryWatch(6));
//        System.out.println(bw.readBinaryWatch(7));
//        System.out.println(bw.readBinaryWatch(10));


    }
}
