package legion.alpha.ssd_shop.domain;

public enum FormFactor {
    inch_2_5(0),
    m2_2280(1),
    m2_2242(2);

    private final int value;

    FormFactor(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static FormFactor fromValue(int value) {
        for (FormFactor myEnum : values()) {
            if (myEnum.getValue() == value) {
                return myEnum;
            }
        }
        throw new IllegalArgumentException("Invalid value for FormFactor: " + value);
    }
}