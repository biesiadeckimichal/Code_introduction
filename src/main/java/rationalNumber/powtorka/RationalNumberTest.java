package rationalNumber.powtorka;

public class RationalNumberTest {
    private int numerator;
    private int denominator;

    public RationalNumberTest (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void multiply(RationalNumberTest value) {
        this.numerator *= value.numerator;
        this.denominator *= value.denominator;
    }

    public void divide(RationalNumberTest value) {
        this.numerator *= value.denominator;
        this.denominator *= value.numerator;
    }

    public RationalNumberTest getOpposite() {
        return new RationalNumberTest(-numerator, denominator);
    }

    public RationalNumberTest getInverse() {
        return new RationalNumberTest(denominator,numerator);
    }

    public void add(int value) {
        this.numerator = numerator + denominator * value;
    }

    public int getEuklides(int a, int b) {
        while (a % b != 0) {
            a = b;
            b = b % a;
        }
        return b;
    }
}
