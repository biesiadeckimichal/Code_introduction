package if_loop;

public class Case1 {
    public static void main (String[] args){
        int a = 77;
        int b = 42;
        int c = 77;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " jest najwieksze");
            } else  {
                System.out.println(c + " jest najwieksze");
            }
        } else {
            if (b > c) {
                System.out.println(b + " jest najwieksze");
            } else {
                System.out.println(c + " jest najwieksze");
            }
        }
    }
}
