package rationalNumber;

public class RationalNumber {
    // przy klasach uzywamy private przy tworzeniu pol
    // to sa pola nie nazywajmy ich zmiennymi, choc w sumie nimi sa
    private int numerator;
    private int denominator;

    // konstruktor, jesli go nie stworze to i tak istnieje konstruktor domslny
    // czyli new RationalNumber(), ale jego pola sa puste
    // slowo this oznacza ze chodzi o konkretne pole z wiersza 6,
    // w konstruktorze lewa strona to jest dane pole obiektu, a lewa to jest dana
    // ktora pobieramy z konsoli, to co uzytkownik wpisze
    // this stosujemy dlatego ze parametr ma taka sama nazwe jak pole
    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    // wpisujemy RationalNumber w nawiasach bo przeciez tam wpisujemy typ
    // a przeciez stworzylismy sobie typ RationalNumber do wyswietlania liczby wymiernej!!!!
    // tak samo jak wpisywalismy typ int String itp...!!!!!!!!!!!!

    //  public void multiply(RationalNumber newNumber) {
    //  int numeratorResult = newNumber.numerator * numerator;
    //  int denominatorResult = newNumber.denominator * denominator;
    //  numerator - oznacza pole obiektu dla ktorego wywoluje metode
    //  value.numerator - oznacza parametr obiektu bedace w tym przypadku przyjmowanym
    //  parametrem metody multiply

    public void multiply(RationalNumber value) {
        numerator = numerator * value.numerator;
        denominator = denominator * value.denominator;
    }

    public void divide(RationalNumber value) {
        numerator = numerator * value.denominator;
        denominator = denominator * value.numerator;
    }

//    public RationalNumber getOpposite

    public RationalNumber getOpposite() {
        return new RationalNumber(numerator * (-1),denominator);
    }

    public static RationalNumber multiply(RationalNumber value1, RationalNumber value2) {
        int numerator = value1.numerator * value2.numerator;
        int denominator = value1.denominator * value2.denominator;
        return new RationalNumber(numerator, denominator);
    }
}
