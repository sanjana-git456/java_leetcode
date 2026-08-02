
public class Palindrome {

    public boolean pal(char[] x) {
        int left = 0;
        int right = x.length - 1;
        for (int i = 0; i < x.length; i++) {
            if (!Character.isLetterOrDigit(x[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(x[right])) {
                right--;
            } else {
                if (Character.toLowerCase(x[left]) != Character.toLowerCase(x[right])) {
                    return false;
                }
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
