
public class PlusOne {

    public int[] plusone(int[] digits) {
        long num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = num * 10 + digits[i];
        }
        num += 1;
        String s = Long.toString(num);
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i) - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        PlusOne p = new PlusOne();
        int[] digits = {9, 9, 9};
        int[] result = p.plusone(digits);
        System.out.println(java.util.Arrays.toString(result));
    }
}
