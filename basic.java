
import java.util.*;

public class Basic {

    public static void main(String[] args) {
        String s = "hi";
        int a = 10;
        double b = 5.5;
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.size());
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 5);
        map.put("banana", 3);
        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("apple"));
    }
}
