public class TurnOffLightCommand implements Command {
    private Light light;
    private boolean wasOnBefore; // Pour garder l'état précédent

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.wasOnBefore = light.isOn();
        light.turnOff();
    }

    @Override
    public void undo() {
        if (wasOnBefore) {
            light.turnOff();
        }
    }
}

