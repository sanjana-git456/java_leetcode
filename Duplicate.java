
import java.util.*;

public class Duplicate {

    public boolean dup(int[] x) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < x.length; i++) {
            if (seen.contains(x[i])) {
                return true;
            }
            seen.add(x[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Duplicate d = new Duplicate();
        int[] arr = {1, 4, 9, 8, 2, 1, 5, 0, 3};
        System.out.println(d.dup(arr));
    }
}
