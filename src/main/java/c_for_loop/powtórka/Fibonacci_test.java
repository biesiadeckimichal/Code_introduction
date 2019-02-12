package c_for_loop.powtórka;

public class Fibonacci_test {

    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int sum;
        for (int i=0; i<10; i++) {
            System.out.println(f1);
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
    }

}
