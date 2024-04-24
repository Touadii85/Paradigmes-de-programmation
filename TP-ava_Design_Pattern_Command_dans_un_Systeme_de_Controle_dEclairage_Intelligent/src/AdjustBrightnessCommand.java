public class AdjustBrightnessCommand implements Command{
    private Light light;
    private int newItensity;
    private int previousIntensity;

    public AdjustBrightnessCommand(Light light, int newItensity) {
        this.light = light;
        this.newItensity = newItensity;
    }

    @Override
    public void execute(){
        previousIntensity = light.getIntensity();
        light.setIntensity(newItensity);
    }

    @Override
    public void undo() {
        light.setIntensity(previousIntensity);
    }
}
