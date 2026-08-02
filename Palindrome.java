
public class Palindrome {

    public boolean pal(char[] x) {
        int left = 0;
        int right = x.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(x[left])) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(x[right])) {
                right--;
            }
            if (Character.toLowerCase(x[left]) != Character.toLowerCase(x[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        char[] arr = "A man, a plan, a canal: Panama".toCharArray();
        System.out.println(p.pal(arr));
    }
}
