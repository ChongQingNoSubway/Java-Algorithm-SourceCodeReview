package nestclassIteratorEnumGeneric;

public interface Food {
    enum Coffee implements Food {
        BLACK_coffee, decaf_coffee
    }
    enum Dessert implements Food {
        FRUIT, CAKE, GELATO
    }
}
