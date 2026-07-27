
public class LongestSubstr {

    public int rep(char[] arr) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxlen = 0;
        for (int right = 0; right < arr.length; right++) {
            if (window.containsKey(arr[right])) {
                left++;
            }
        }
        l.(add[right])
    }
}
