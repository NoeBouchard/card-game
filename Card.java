public final class Card {
    // card has a positive integer value
    private final int value;
    public Card(int value) {
        if (value < 1) throw new IllegalArgumentException("value must be >= 1");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
