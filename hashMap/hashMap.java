import java.util.*;

public class hashMap{
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding elements to HashMap

        hashMap.put(1, "hello");
        hashMap.put(2, "hello");
        hashMap.put(3, "hello");
        hashMap.put(4, "hello");

        System.out.println(hashMap.get(3));
    }
}