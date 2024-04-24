public class CoffeeOrderBuilder {
    private String coffeeType = "Expresso";
    private boolean lait = false;
    private boolean sucre = false;
    private boolean caramel = false;

    // Setters pour configurer les attributs
    public CoffeeOrderBuilder setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
        return this;
    }

    public CoffeeOrderBuilder setLait(boolean lait) {
        this.lait = lait;
        return this;

    }

    public CoffeeOrderBuilder setSucre(boolean sucre) {
        this.sucre = sucre;
        return this;
    }

    public CoffeeOrderBuilder setCaramel(boolean caramel) {
        this.caramel = caramel;
        return this;
    }

    public CoffeeOrder build(){
        return new CoffeeOrder(coffeeType, lait, sucre, caramel);
    }
}
