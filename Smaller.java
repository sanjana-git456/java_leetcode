
import java.util.*;

public class Smaller {

    public int[] small(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] newnums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(newnums);
        for (int i = 0; i < newnums.length; i++) {
            if (!map.containsKey(newnums[i])) {
                map.put(newnums[i], i);
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Smaller s = new Smaller();
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = s.small(nums);
        System.out.println(Arrays.toString(result));
    }
}
