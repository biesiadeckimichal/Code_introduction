package rationalNumber.euklides;

public class Euklides {
    public static void main(String[] args) {
    int a = 500;
    int b = 20;
    int nwd;

    if (a % b == 0) {
        nwd = b;
    } else {
        a = b;
        b = a % b;

    }
        a = b;
        b = b % a;
        System.out.println(b);
    }
}
