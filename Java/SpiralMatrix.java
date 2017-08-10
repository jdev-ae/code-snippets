public class SpiralMatrix {

    public static void main(String[] args) {

        int[][] data = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}};

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%3d ", data[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");

        int rows = data.length, cols = data[0].length;
        int tot = rows * cols;

        int minR = 0, minC = 0, maxR = rows - 1, maxC = cols - 1;
        int r = minR, c = minC;
        for (int i = 0; i < tot; i++) {
            System.out.print(data[r][c] + ", ");
            if (r == minR && c < maxC) {
                c++;
            } else if (c == maxC && r < maxR) {
                r++;
            } else if (r == maxR && c > minC) {
                c--;
            } else if (c == minC && r >= minR) {
                r--;
                if (r == minR) {
                    minR++;
                    minC++;
                    maxR--;
                    maxC--;
                    r = minR;
                    c = minC;
                }
            }
        }
    }
}
