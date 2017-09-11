public class TowerOfHanoi {
    public static void main(String[] args) {
        int nDisks = 3;
        move(nDisks, 'A', 'B', 'C');
    }

    public static void move(int top, char from, char inter, char to) {
        if (top == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            move(top - 1, from, to, inter);
            System.out.println("Disk " + top + " from " + from + " to " + to);
            move(top - 1, inter, from, to);
        }
    }
}
