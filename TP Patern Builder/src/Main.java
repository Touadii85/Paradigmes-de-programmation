import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    private CoffeeOrderBuilder coffeeOrderBuilder;

    @BeforeEach
    void setUp(){
        coffeeOrderBuilder = new CoffeeOrderBuilder();
    }

    @Test
    void testDefaultCoffeeOrder(){
        // Test de la création d'une commande de café avec les valeurs par défaut
        CoffeeOrder defaultCoffeeOrder = coffeeOrderBuilder.build();

        // Vérification des valeurs par défaut
        assertEquals("Expresso", defaultCoffeeOrder.getCoffeeType());
        assertEquals(false, defaultCoffeeOrder.isMilk());
        assertEquals(false, defaultCoffeeOrder.isSugar());
        assertEquals(false, defaultCoffeeOrder.isCaramel());
    }

    @Test
    void testSetCoffeeType() {
        // Test du setter pour le type de café
        CoffeeOrder coffeeOrder = coffeeOrderBuilder.setCoffeeType("Latte").build();
        assertEquals("Latte", coffeeOrder.getCoffeeType());
    }

    @Test
    void testSetMilk() {
        // Test du setter pour le lait
        CoffeeOrder coffeeOrder = coffeeOrderBuilder.setLait(true).build();
        assertEquals(true, coffeeOrder.isMilk());
    }

    @Test
    void testSetSugar() {
        // Test du setter pour le sucre
        CoffeeOrder coffeeOrder = coffeeOrderBuilder.setSucre(true).build();
        assertEquals(true, coffeeOrder.isSugar());
    }

    @Test
    void testSetCaramel() {
        // Test du setter pour le caramel
        CoffeeOrder coffeeOrder = coffeeOrderBuilder.setCaramel(true).build();
        assertEquals(true, coffeeOrder.isCaramel());
    }

    @Test
    void testCoffeeBuilder(){
        CoffeeOrder coffeeOrder1 = coffeeOrderBuilder.setCoffeeType("Latte").setLait(true).setSucre(true).setCaramel(false).build();
        CoffeeOrder coffeeOrder2 = coffeeOrderBuilder.setCoffeeType("Cappuccino").setLait(true).setSucre(false).setCaramel(true).build();
        CoffeeOrder coffeeOrder3 = coffeeOrderBuilder.setCoffeeType("Americano").setLait(false).setSucre(false).setCaramel(false).build();

        assertEquals("Latte", coffeeOrder1.getCoffeeType());
        assertEquals(true, coffeeOrder1.isMilk());
        assertEquals(true, coffeeOrder1.isSugar());
        assertEquals(false, coffeeOrder1.isCaramel());

        assertEquals("Cappuccino", coffeeOrder2.getCoffeeType());
        assertEquals(true, coffeeOrder2.isMilk());
        assertEquals(false, coffeeOrder2.isSugar());
        assertEquals(true, coffeeOrder2.isCaramel());

        assertEquals("Americano", coffeeOrder3.getCoffeeType());
        assertEquals(false, coffeeOrder3.isMilk());
        assertEquals(false, coffeeOrder3.isSugar());
        assertEquals(false, coffeeOrder3.isCaramel());
    }
}