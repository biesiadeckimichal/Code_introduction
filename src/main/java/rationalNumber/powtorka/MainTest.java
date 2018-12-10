package rationalNumber.powtorka;

public class MainTest {
    public static void main(String[] args) {
        RationalNumberTest myRationalNumber = new RationalNumberTest(4,5);
        RationalNumberTest piecPrzezDwa = new RationalNumberTest(5,2);
        RationalNumberTest dwaPrzezTrzy = new RationalNumberTest(2,3);

        myRationalNumber.print();
        piecPrzezDwa.print();

        System.out.println();

        myRationalNumber.multiply(piecPrzezDwa);
        myRationalNumber.print();

        System.out.println();

        myRationalNumber.divide(dwaPrzezTrzy);
        myRationalNumber.print();

        System.out.println();

        RationalNumberTest oppositeRationalNumber = myRationalNumber.getOpposite();
        oppositeRationalNumber.print();

        System.out.println();

        RationalNumberTest inverseRationalNumber = myRationalNumber.getInverse();
        inverseRationalNumber.print();

        System.out.println();
        myRationalNumber.print();

        myRationalNumber.add(5);
        myRationalNumber.print();

        myRationalNumber.getEuklides(100,50);
        myRationalNumber.print();

    }

}
