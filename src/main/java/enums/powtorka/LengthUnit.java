package enums.powtorka;

public enum LengthUnit {
    METER("metr"),
    FOOT("stopa"),
    CETIMETER("centymetr"),
    INCH("inch");
    private String prettyName;

    LengthUnit (String prettyName) {
        this.prettyName = prettyName;
    }

    public String getPrettyName() {
        return prettyName;
    }

    public static LengthUnit getByPrettyName(String prettyName) {
        for (LengthUnit lengthUnit: values()) {
            if (prettyName.equals(lengthUnit.getPrettyName())) {
                return lengthUnit;
            }
        }
        return null;
    }
}
