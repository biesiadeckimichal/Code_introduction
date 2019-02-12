package c_for_loop;

public class Case9 {
    public static void main(String[] args) {
        int x = 5;
        for (int i = x; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
