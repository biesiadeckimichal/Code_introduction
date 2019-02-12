package c_for_loop;

public class Case2 {
    public static void main(String[] args) {
        for (int i = 55; i < 151; i++) {
            if (i == 55) {
                System.out.println(i);
            } else if (i == 150){
                System.out.println();
                System.out.println(i);
            } else {
                System.out.print(i);
            }
        }
    }
}
