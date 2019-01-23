package for_loop;

// 0 1 1 2 3 //
// (n - 1) + (n - 2)

//0 1 1 2 3
//0 1 2 3 4

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        int f1 = 0;
        int f2 = 1;
        for (int i = 0; i < 10; i++) {
            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            System.out.println(sum);

        }
    }

}
