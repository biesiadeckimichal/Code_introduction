package enums;

public class Main {
    public static void main(String[] args) {
        // ctrl + space wyswietla podpowiedzi
        // w typie wyliczeniowym mamy do dyspozycji kilka wartosci
        // Do wybranej wartości enuma odwołujemy się pisząc nazwę klasy,
        // po której wskazujemy wartość
        LengthUnit myLengthUnit = LengthUnit.METER;
        LengthUnit myOtherLengthUnit = LengthUnit.METER;

        // Enumy możemy porównywać za pomocą operatora ==
        System.out.println(myLengthUnit == myOtherLengthUnit);
        // lub metody equals (w tym przypadku jeśli metodę wywołamy na nullu, to będzie wyrzucony
        // NullPointerException!
        System.out.println(myLengthUnit.equals(myOtherLengthUnit));
        System.out.println();

        // Wartość enuma jest też obiektem.
        // lengthunit oferuje wszystkie metody i cechy typu object
        Object object = LengthUnit.FOOT;

        // Metoda statyczna values zwraca wszystkie wartości enuma
        // wyrzucamy wszystkie typy zapisane w danym enumie
        // skrot LengthUnit[].for - skrot dla petli
        LengthUnit[] lengthUnits = LengthUnit.values();
        for (LengthUnit lengthUnit : lengthUnits) {
            System.out.println(lengthUnit);
        }
        System.out.println();


        // Wartość zgodnie z jej nazwą uzyskujemy za pomocą metody statycznej valueOf
        LengthUnit lengthUnitFromString = LengthUnit.valueOf("INCH");
        // toString() enuma zwróci jego nazwę
        System.out.println(lengthUnitFromString);
        System.out.println();

        System.out.println(myLengthUnit.getPrettyName());

        System.out.println(LengthUnit.getByPrettyName("centymetr"));
    }
}
