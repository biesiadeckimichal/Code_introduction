package rationalNumber;

public class Main {
    public static void main(String[] args) {
        RationalNumber myRationalNumber = new RationalNumber(2,5);
        RationalNumber osiemPrzezSiedem = new RationalNumber(8,7);
        RationalNumber dwaPrzezTrzy = new RationalNumber(2,3);

        System.out.println("liczba wymierna 1: ");
        myRationalNumber.print();

        RationalNumber myRationalNumber2 = new RationalNumber(4,5);
        System.out.println("liczba wymierna 2: ");
        myRationalNumber2.print();
        System.out.println();

//      myRationalNumber.multiply(new RationalNumber(4,5));
        System.out.println("liczba wymierna po multiply: ");
        myRationalNumber.multiply(myRationalNumber2);
        myRationalNumber.print();

        System.out.println();

        System.out.println("liczba wymierna po divide: ");
        myRationalNumber.divide(myRationalNumber2);
        myRationalNumber.print();

        System.out.println();

        System.out.println("liczba wymierna po getOpposite: ");
        RationalNumber opositeNumber = myRationalNumber.getOpposite();
        opositeNumber.print();

        RationalNumber wynikMnozenia = RationalNumber.multiply(osiemPrzezSiedem, dwaPrzezTrzy);
        wynikMnozenia.print();



    }
}
