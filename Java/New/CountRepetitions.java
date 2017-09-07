import java.util.*;

public class CountRepetitions {
    public static void main(String[] args) {
        int[] ints = {2, 3, 4, 2, 2, 2, 5, 5, 7, 7, 9, 9, 7, 7, 9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : ints) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        /*
            Lambda implementation
            Optional<Integer> max = map.values().stream().max((o1, o2) -> o1 > o2 ? o1 : o2);
         */

        Optional<Integer> max = map.values().stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? o1 : o2;
            }
        });

        System.out.println(map);
        System.out.println(max.get());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max.get()) {
                System.out.println(entry);
            }
        }
    }
}
