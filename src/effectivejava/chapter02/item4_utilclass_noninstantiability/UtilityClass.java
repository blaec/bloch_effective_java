package effectivejava.chapter02.item4_utilclass_noninstantiability;

// Noninstantiable utility class (Page 19)
public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }

    // Remainder omitted
}
