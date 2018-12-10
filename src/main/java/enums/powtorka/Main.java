package enums.powtorka;

public class Main {
    public static void main(String[] args) {

        LengthUnit myLengthUnit = LengthUnit.METER;
        LengthUnit myOtherLengthUnit = LengthUnit.INCH;

        System.out.println(myLengthUnit == myOtherLengthUnit);
        System.out.println(myLengthUnit.equals(myOtherLengthUnit));

        Object object = LengthUnit.FOOT;

        LengthUnit[] lengthUnits = LengthUnit.values();
        for (LengthUnit lengthUnit: lengthUnits) {
            System.out.print(lengthUnit + " ");
        }
        System.out.println();

        LengthUnit lengthUnitFromString = LengthUnit.valueOf("INCH");
        System.out.println(lengthUnitFromString);
        System.out.println(myLengthUnit.getPrettyName());
        System.out.println(myOtherLengthUnit.getPrettyName());
        System.out.println(LengthUnit.getByPrettyName("centymetr"));

    }
}
