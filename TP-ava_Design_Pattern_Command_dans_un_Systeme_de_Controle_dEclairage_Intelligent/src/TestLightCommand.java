import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLightCommand {
    private Light light;
    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command adjustBrightnessCommand;

    @BeforeEach
    void setUp(){
        light = new Light();
        turnOnCommand = new TurnOnLightCommand(light);
        turnOffCommand = new TurnOffLightCommand(light);
        adjustBrightnessCommand = new AdjustBrightnessCommand(light, 70);
    }

    @Test
    void testLightInitiallyOff() {
        assertFalse(light.isOn(), "La lumière devrait être éteinte initialement.");
    }

    @Test
    void testTurnOnLight(){
        turnOnCommand.execute();
        assertTrue(light.isOn(), "la Lumière dvrait être Allumé après l'éxécution de la commande");
        assertEquals(50, light.getIntensity(), "L'intensité devrait être réglée à 50 après allumage.");
    }

    @Test
    void testOffLight(){
        turnOnCommand.execute();
        turnOffCommand.execute();
        assertFalse(light.isOn(), "La lumière devrait être éteinte après l'exécution de la commande.");
        assertEquals(0, light.getIntensity(), "L'intensité devrait être réglée à 0 après extinction.");
    }

    @Test
    void testAdjustBrightness(){
        turnOnCommand.execute(); // La lampe doit être allumée pour régler l'intensité
        assertEquals(50, light.getIntensity(), "L'intensité devrait être réglée à 50.");
        adjustBrightnessCommand.execute();
        assertEquals(70, light.getIntensity(), "L'intensité devrait être réglée maintenant à 70.");
    }

    @Test
    void testUndoTurnOnLight() {
        turnOnCommand.execute();
        turnOnCommand.undo();
        assertFalse(light.isOn(), "La lumière devrait être éteinte après annulation de la commande d'allumage.");
    }

    @Test
    void testUndoTurnOffLight() {
        turnOnCommand.execute(); // Allume la lampe pour tester l'annulation de son extinction
        turnOffCommand.execute();
        turnOffCommand.undo();
        assertTrue(light.isOn(), "La lumière devrait être rallumée après annulation de la commande d'extinction.");
        assertEquals(50, light.getIntensity(), "L'intensité devrait revenir à 50 après l'annulation de l'extinction.");
    }

    @Test
    void testUndoAdjustBrightness() {
        turnOnCommand.execute(); // La lampe doit être allumée pour régler l'intensité
        adjustBrightnessCommand.execute();
        adjustBrightnessCommand.undo();
        assertEquals(50, light.getIntensity(), "L'intensité devrait revenir à 50 après annulation du réglage.");
    }
}
