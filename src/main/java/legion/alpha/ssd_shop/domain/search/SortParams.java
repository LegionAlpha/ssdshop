package legion.alpha.ssd_shop.domain.search;

public enum SortParams {
    ByPrice(0),
    ByWritingSpeed(1),
    ByReadingSpeed(2);

    private final int value;

    SortParams(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static SortParams fromValue(int value) {
        for (SortParams myEnum : values()) {
            if (myEnum.getValue() == value) {
                return myEnum;
            }
        }
        throw new IllegalArgumentException("Invalid value for SortParams: " + value);
    }
}