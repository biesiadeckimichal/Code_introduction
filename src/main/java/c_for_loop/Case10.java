package c_for_loop;

public class Case10 {
    public static void main(String[] args) {
        int x = 4;
        // czemu w przypadku i > 0, oraz i >= 0 ilosc wierszy jest ta sama?
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                // czy dobrze rozumiem ze ta petla startuje za kazdym razem od nowa? (przy kazdym nowym wierszu i)
                System.out.print("z");
            }
            for (int k = x; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
