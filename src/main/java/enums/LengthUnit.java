package enums;

public enum LengthUnit {
    // Enum to typ wyliczeniowy - mamy dostępne jedynie kilka wartości tego typu,
    // te, które wymieniamy oddzielając je przecinkami.

    // enumy piszemy duzymi literami
    // w enumach tak jesst ze po nazwie wartosci dopisujemy ("") z nazwa
    // ktorej chcemy uzywac dla danego obiektu...czy jakos tak
    // to nie sa pola, to sa wyliczone wartosci tego typu
    METER("metr"),
    FOOT("stopa"),
    CENTIMETER("centymetr"),
    INCH("cal");

    // Polu będzie przypisana polska nazwa
    private String prettyName;

    // bez publica bo nie chcemy zeby te pola u gory byly dostepne poza klasa
    // Konstruktor wartości enuma (wywoływany tylko  4 razy - do utworzenia METER, FOOT, CENTIMETER i INCH
    LengthUnit(String prettyName) {
        this.prettyName = prettyName;
    }

    // Getter dla pola prettyName
    public String getPrettyName() {
        return prettyName;
    }

    // Metoda statyczna zwracająca wartośc na podstawie wartości pola prettyName
    public static LengthUnit getByPrettyName(String prettyName) {
        // mamy dostep do metod statycznych ktore oferuje typ enum, ma po
        // prostu przypisana do siebie taka metode
        // metoda values zwraca chyba tablice wartosci (trzeba to sprawdzic)
        // values().for skrot
        // values() zwraca nam ponizsza tablice, to jest dokladnie to samo
        // LengthUnit[] values = {METER, FOOT, CENTIMETER, INCH}
        // ponizsza petla przelatuje przez tablice wartosci enuma
        for (LengthUnit lengthUnit : values()) {
            if (prettyName.equals(lengthUnit.getPrettyName())) {
                return lengthUnit;
            }
        }
        return null;
    }
}
