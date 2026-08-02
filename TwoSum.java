
import java.util.*;

public class TwoSum {

    public void two(int[] x, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            int a = t - x[i];
            if (map.containsKey(a)) {
                System.out.println(map.get(a) + " " + i);
            }
            map.put(x[i], i);
        }
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] arr = {2, 7, 11, 15};
        int t = 9;
        ts.two(arr, t);
    }
}
