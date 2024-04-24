public class CoffeeOrder {
    private String coffeeType;
    private boolean milk;
    private boolean sugar;
    private boolean caramel;

    // Constructeur privé utilisé par le Builder
    CoffeeOrder(String coffeeType, boolean milk, boolean sugar, boolean caramel) {
        this.coffeeType = coffeeType;
        this.milk = milk;
        this.sugar = sugar;
        this.caramel = caramel;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isCaramel() {
        return caramel;
    }

    public void setCaramel(boolean caramel) {
        this.caramel = caramel;
    }
}
