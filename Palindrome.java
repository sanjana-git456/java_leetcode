
public class Palindrome {

    public void pal(char[] word) {
        int left = 0;
        int right = word.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(word[left])) {
                left += 1;
            }
            while (left < right && !Character.isLetterOrDigit(word[right])) {
                right -= 1;
            }
            if (Character.toLowerCase(word[left]) != Character.toLowerCase(word[right])) {
                System.out.println("False");
                return;
            }
            left += 1;
            right -= 1;
        }
        System.out.println("True");
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        char[] s = "A man, a plan, a canal: Panama".toCharArray();
        p.pal(s);
    }
}
