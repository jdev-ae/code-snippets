import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortRoute {
    public static void main(String[] args) {
        List<Integer> visited = new ArrayList<>();
        int[][] route = {
                {0, 2, 3, 100, 100},
                {2, 0, 15, 2, 100},
                {3, 15, 0, 100, 13},
                {100, 2, 100, 0, 9},
                {100, 100, 13, 9, 0}
        };
        findRoute(route, visited);
    }

    private static void findRoute(int[][] route, List<Integer> visited) {
        int lastIndex = 0;
        for (int i = 0; i < route.length; i++) {
            visited.add(lastIndex);
            lastIndex = getMinIndex(route[i], visited);
        }
        System.out.println(visited);
    }

    private static int getMinIndex(int[] x, List<Integer> visited) {
        int min = 0;
        int val = Integer.MAX_VALUE;
        System.out.println("v: " + visited);
        System.out.println("x: " + Arrays.toString(x));
        System.out.println("-------");
        for (int i = 0; i < x.length; i++) {
            if (!visited.contains(i) && x[i] != 0) {
                if (val > x[i]) {
                    val = x[i];
                    min = i;
                }
            }
        }
        return min;
    }
}
