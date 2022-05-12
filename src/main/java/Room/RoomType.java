package Room;

public enum RoomType {
    SINGLE(1, 39.99),
    DOUBLE(2, 59.99),
    FAMILY(4, 82.00),
    SUITE(2, 99.99);

    private final int value;
    private final double rate;

    RoomType(int value, double rate) {
        this.value = value;
        this.rate = rate;
    }

    public int getValue(){
        return this.value;
    }

    public double getRate(){
        return this.rate;
    }
}

