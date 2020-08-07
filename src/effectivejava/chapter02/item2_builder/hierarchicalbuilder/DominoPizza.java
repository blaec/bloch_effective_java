package effectivejava.chapter02.item2_builder.hierarchicalbuilder;

public class DominoPizza extends Pizza{

    public static class Builder extends Pizza.Builder<Builder> {
        public Builder() {
        }

        @Override DominoPizza build() {
            return new DominoPizza(this);
        }

        @Override protected Builder self() {
            return this;
        }
    }


    private DominoPizza(Builder builder) {
        super(builder);
    }

    @Override public String toString() {
        return String.format("Basic Domino Pizza%s", toppings.isEmpty()
                ? ""
                : String.format(" with %s", toppings));
    }
}
