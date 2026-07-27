
import java.util.HashSet;

public class LongestSubstr {

    public int rep(char[] arr) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxlen = 0;
        for (int right = 0; right < arr.length; right++) {
            while (window.contains(arr[right])) {
                window.remove(arr[left]);
                left++;
            }
            window.add(arr[right]);
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        LongestSubstr ls = new LongestSubstr();
        char[] s = "abcbde".toCharArray();
        System.out.println(ls.rep(s));
    }
}
