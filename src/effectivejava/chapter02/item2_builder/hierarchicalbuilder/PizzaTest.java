package effectivejava.chapter02.item2_builder.hierarchicalbuilder;

import static effectivejava.chapter02.item2_builder.hierarchicalbuilder.Pizza.Topping.*;
import static effectivejava.chapter02.item2_builder.hierarchicalbuilder.NyPizza.Size.*;

// Using the hierarchical builder (Page 16)
public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        DominoPizza dominoPizza = new DominoPizza.Builder().build();
        DominoPizza dominoPizza2 = new DominoPizza.Builder()
                .addTopping(MUSHROOM)
                .addTopping(HAM)
                .addTopping(MUSHROOM)
                .build();

        System.out.println(pizza);
        System.out.println(calzone);
        System.out.println(dominoPizza);
        System.out.println(dominoPizza2);
    }
}
