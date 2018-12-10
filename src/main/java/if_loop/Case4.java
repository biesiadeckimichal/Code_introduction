package if_loop;

public class Case4 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("podaj pierwsza liczbe do porownania: ");
//        int x = input.nextInt();
//        System.out.print("podaj drugą liczbe do porównania: ");
//        int y = input.nextInt();

        int x = 5;
        int y = 0;

        if (x > y) {
            System.out.println(x + " jest wieksze od " + y);
        } else if (x < y) {
            System.out.println(x + " jest mniejsze od " + y);
        } else {
            System.out.println(x + " jest rowne " + y);
        }
    }
}
