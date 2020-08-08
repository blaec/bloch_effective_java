1. Declare an int variable named result, and initialize it to the hash code c for the first significant field in your object, as computed in step 2.a. (Recall from Item 10 that a significant field is a field that affects equals comparisons.)
2. For every remaining significant field f in your object, do the following:

    > **a** Compute an `int` hash code c for the field:

    >> **i** If the field is of a primitive type, compute `Type.hashCode(f)`, where Type is the boxed primitive class corresponding to f’s type.

    >> **ii** If the field is an object reference and this class’s equals method compares the field by recursively invoking equals, recursively invoke `hashCode` on the field. If a more complex comparison is required, compute a “canonical representation” for this field and invoke `hashCode` on the canonical representation. If the value of the field is null, use 0 (or some other constant, but 0 is traditional).

    >> **iii** If the field is an `array`, treat it as if each significant element were a separate field. That is, compute a hash code for each significant element by applying these rules recursively, and combine the values per step 2.b. If the array has no significant elements, use a constant, preferably not 0. If all elements are significant, use `Arrays.hashCode`.

    > **b** Combine the hash code c computed in step 2.a into result as follows: `result = 31 * result + c`;
3. Return result.