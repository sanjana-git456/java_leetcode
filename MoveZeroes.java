
import java.util.*;

public class MoveZeroes {

    public int[] zero(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        arr1.addAll(arr2);
        int[] result = new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
            result[i] = arr2.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        int[] result = m.zero(nums);
        System.out.println(Arrays.toString(result));
    }
}
