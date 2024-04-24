import java.util.ArrayList;

public class LightControlPanel {
    private ArrayList<Light> lights; // Liste pour stocker les objets Light.

    // Constructeur de la class initialise la liste des lumières.
    public LightControlPanel() {
        lights = new ArrayList<>();
    }

    // Ajoute une lumière à la liste des lumières contrôlées par le panneau.
    public void addLight(Light light) {
        lights.add(light);
    }

    // Retire une lumière de la liste, permettant de réduire le nombre de lumières contrôlées.
    public void removeLight(Light light) {
        lights.remove(light);
    }

    // Allume toutes les lumières dans la liste. Chaque lumière est affectée individuellement.
    public void turnAllLightsOn() {
        for (Light light : lights) {
            light.turnOn();
        }
    }

    // Éteint toutes les lumières dans la liste, assurant qu'aucune lumière n'est laissée allumée.
    public void turnAllLightsOff() {
        for (Light light : lights) {
            light.turnOff();
        }
    }

    // Régle l'intensité de toutes les lumières à une valeur spécifique, si elles sont allumées.
    public void setIntensityForAllLights(int intensity) {
        for (Light light : lights) {
            light.setIntensity(intensity);
        }
    }

    // Allume une lumière spécifique par son index dans la liste, permettant un contrôle individuel.
    public void turnOnLight(int index) {
        if (isValidIndex(index)) {
            lights.get(index).turnOn();
        }
    }

    // Éteint une lumière spécifique par son index, utile pour contrôler les lumières individuellement.
    public void turnOffLight(int index) {
        if (isValidIndex(index)) {
            lights.get(index).turnOff();
        }
    }

    // Régle l'intensité d'une lumière spécifique par son index, permettant un ajustement fin.
    public void setIntensityOfLight(int index, int intensity) {
        if (isValidIndex(index)) {
            lights.get(index).setIntensity(intensity);
        }
    }

    // Obtient l'intensité de la lumière spécifiée par index, permettant de surveiller les réglages actuels.
    public int getIntensityOfLight(int index) {
        if (isValidIndex(index)) {
            return lights.get(index).getIntensity();
        }
        return -1; // Indique une erreur si l'index est invalide.
    }

    // Retourne le nombre total de lumières contrôlées par le panneau, utile pour la gestion.
    public int numberOfLights() {
        return lights.size();
    }

    // Méthode privée pour vérifier que l'index donné est dans la plage valide pour la liste des lumières.
    private boolean isValidIndex(int index) {
        return index >= 0 && index < lights.size();
    }
}




