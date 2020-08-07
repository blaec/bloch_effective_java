This list is far from exhaustive:
- **from** — A type-conversion method that takes a single parameter and returns a
corresponding instance of this type, for example:

    `Date d = Date.from(instant);`
- **of** — An aggregation method that takes multiple parameters and returns an instance of this type that incorporates them, for example:

    `Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);`
- **valueOf** — A more verbose alternative to from and of, for example:

    `BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);`
- **instance** or **getInstance** — Returns an instance that is described by its parameters (if any) but cannot be said to have the same value, for example:

    `StackWalker luke = StackWalker.getInstance(options);`
- **create** or **newInstance** — Like `instance` or `getInstance`, except that the
method guarantees that each call returns a new instance, for example:

    `Object newArray = Array.newInstance(classObject, arrayLen);`
- **getType** — Like `getInstance`, but used if the factory method is in a different
class. `Type` is the type of object returned by the factory method, for example:

    `FileStore fs = Files.getFileStore(path);`
- **newType** — Like `newInstance`, but used if the factory method is in a different
class. `Type` is the type of object returned by the factory method, for example:

    `BufferedReader br = Files.newBufferedReader(path);`
- **type** — A concise alternative to `getType` and `newType`, for example:

    `List<Complaint> litany = Collections.list(legacyLitany);`