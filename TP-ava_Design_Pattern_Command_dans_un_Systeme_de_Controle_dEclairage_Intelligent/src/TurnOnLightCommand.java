public class TurnOnLightCommand implements Command{
    private Light light;
    private boolean wasOnBefore; // Pour garder l'état précédent

    public TurnOnLightCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        this.wasOnBefore = light.isOn();
        light.turnOn();
    }

    @Override
    public void undo(){
        if (!wasOnBefore) {
            light.turnOff();
        }
    }
}
