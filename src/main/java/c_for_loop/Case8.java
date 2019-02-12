package c_for_loop;

public class Case8 {
    public static void main(String[] args) {
//        Scanner pyramidLevel = new Scanner(System.in);
//        System.out.print("podaj wielkosc piramidy: ");
//        int x = pyramidLevel.nextInt();
//        System.out.println();
        int x = 10;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}