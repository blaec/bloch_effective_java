Putting it all together, here’s a recipe for a high-quality equals method:
1. **Use the `==` operator to check if the argument is a reference to this object.** If so, return `true`. This is just a performance optimization but one that is worth doing if the comparison is potentially expensive.
1. **Use the instanceof operator to check if the argument has the correct type.** If not, return `false`. Typically, the correct type is the class in which the method occurs. Occasionally, it is some interface implemented by this class. Use an interface if the class implements an interface that refines the equals contract to permit comparisons across classes that implement the interface. Collection interfaces such as `Set`, `List`, `Map`, and `Map.Entry` have this property.
1. **Cast the argument to the correct type.** Because this cast was preceded by an `instanceof` test, it is guaranteed to succeed.
1. **For each “significant” field in the class, check if that field of the argument matches the corresponding field of this object.** If all these tests succeed, return true; otherwise, return `false`. If the type in Step 2 is an interface, you must access the argument’s fields via interface methods; if the type is a class, you may be able to access the fields directly, depending on their accessibility.

_Comparisons:_
- for primitive fields whose type is not `float` or `double`, use the `==` operator for comparisons; 
- for object reference fields, call the `equals` method recursively;
- for `float` fields, use the `static Float.compare(float, float)` method;
- for `double` fields, use `Double.compare(double, double)`;
- for `array` fields, apply these guidelines to each element. If every element in an array field is significant, use one of the Arrays.equals methods.