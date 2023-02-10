package effectivejava.chapter03.item14_Comparable;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class CompareVsEquals {
    public static void main(String[] args) {
        HashSet<BigDecimal> hashSet = new HashSet<>();
        TreeSet<BigDecimal> treeSet = new TreeSet<>();

        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.00");

        hashSet.add(b1);
        hashSet.add(b2);

        treeSet.add(b1);
        treeSet.add(b2);

        System.out.printf("HashSet = %s\n", hashSet);
        System.out.printf("TreeSet = %s\n", treeSet);

        // HashSet uses equals while TreeSet - compareTo
        // BigDecimal on compareTo for comparison uses value + scale and on equals - only value
        System.out.println(b1.compareTo(b2));
        System.out.println(b1.equals(b2));
    }
}
