public class SnakeMatrix {
    public static void main(String[] args) {
        String[][] data = {
                {"00", "01", "02", "03", "04"},
                {"10", "11", "12", "13", "14"},
                {"20", "21", "22", "23", "24"},
                {"30", "31", "32", "33", "34"},
                {"40", "41", "42", "43", "44"}
        };
        int total = data.length * data[0].length;
        int left = 0, right = data[0].length - 1, top = 0, bottom = data.length - 1;
        int direction = 0;
        int r = 0, c = 0;
        for (int i = 0; i < total; i++) {
            System.out.print(data[r][c] + " -> ");
            if (r == top && direction == 0) {
                if (c + 1 > right) {
                    r++;
                } else {
                    c++;
                }
                direction = 1;
            } else if (c == left && direction == 1) {
                if (c - 1 < left) {
                    if (r + 1 > bottom) {
                        c++;
                    } else {
                        r++;
                    }
                    direction = 0;
                }
            } else if (c == right && direction == 0) {
                r++;
                direction = 1;
            } else if (r == bottom && direction == 1) {
                c++;
                direction = 0;
            } else {
                if (direction == 0) {
                    c++;
                    r--;
                } else {
                    r++;
                    c--;
                }
            }
        }
    }
}

/*
Input:
                {"00", "01", "02", "03", "04"},
                {"10", "11", "12", "13", "14"},
                {"20", "21", "22", "23", "24"},
                {"30", "31", "32", "33", "34"},
                {"40", "41", "42", "43", "44"}
Output
00 [0] -> 01 [1] -> 10 [1] -> 20 [0] -> 11 [0] -> 02 [0] -> 03 [1] -> 12 [1] 
-> 21 [1] -> 30 [1] -> 40 [0] -> 31 [0] -> 22 [0] -> 13 [0] -> 04 [0] -> 14 [1] 
-> 23 [1] -> 32 [1] -> 41 [1] -> 42 [0] -> 33 [0] -> 24 [0] -> 34 [1] -> 43 [1] -> 44 [0] ->
*/
