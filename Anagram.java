
import java.util.*;

public class Anagram {

    public void anagr(char[] s, char[] t) {
        if (s.length != t.length) {
            System.out.println("False");
            return;
        }
        Arrays.sort(s);
        Arrays.sort(t);
        if (Arrays.equals(s, t)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        char[] arr1 = "anagram".toCharArray();
        char[] arr2 = "angrama".toCharArray();
        a.anagr(arr1, arr2);
    }
}
