
import java.util.*;

public class Duplicate {

    public void dup(int[] nums) {
        boolean found = false;
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                System.out.println("True");
                found = true;
            }
            seen.add(nums[i]);
        }
        if (!found) {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        Duplicate d = new Duplicate();
        d.dup(nums);
    }
}
