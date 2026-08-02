
import java.util.*;

public class Anagram {

    public boolean anag(char[] x, char[] y) {
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        char[] arr1 = "anagram".toCharArray();
        char[] arr2 = "nagaram".toCharArray();
        System.out.println(a.anag(arr1, arr2));
    }
}
