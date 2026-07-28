
public class Kadane {

    public int largest(int[] nums) {
        int m = nums[0];
        int maxsofar = nums[0];
        for (int i = 0; i < nums.length; i++) {
            m = Math.max(nums[i], m + nums[i]);
            if (m > maxsofar) {
                maxsofar = m;
            }
        }
        return maxsofar;
    }

    public static void main(String[] args) {
        Kadane k = new Kadane();
        int[] nums = {-3, -1, -2};
        System.out.println(k.largest(nums));
    }
}
