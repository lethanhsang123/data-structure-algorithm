package algorithms.searching.arrays.binary_search;

public enum Type {
    TYPE_1(1),
    TYPE_2(2)
    ;

    public int getValue() {
        return value;
    }

    private final int value;

    Type(int value) {
        this.value = value;
    }

    public static boolean equal(Type value) {
        return TYPE_1.equals(value);
    }
}
