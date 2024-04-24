public class Light{
    private boolean isOn;  // Variable booléenne pour stocker l'état de la lampe (allumée ou éteinte).
    private int intensity; // Variable entière pour stocker l'intensité lumineuse de la lampe.

    // Constructeur de la classe Light. Initialise la lampe éteinte avec une intensité de 0.
    public Light() {
        isOn = false;
        intensity = 0;
    }

    // Méthode pour allumer la lampe. Définit l'état de la lampe à "allumée" et l'intensité à 50.
    public void turnOn(){
        isOn = true;
        intensity = 50;
    }

    // Méthode pour éteindre la lampe. Réinitialise l'état de la lampe à "éteinte" et l'intensité à 0.
    public void turnOff(){
        isOn = false;
        intensity = 0;
    }

    // Méthode pour régler l'intensité de la lampe. Change l'intensité uniquement si la lampe est allumée
    // et si l'intensité donnée est dans l'intervalle autorisé (0 à 100).
    public void setIntensity(int intensity) {
        if (isOn && (intensity >= 0 && intensity <= 100)) {
            this.intensity = intensity;
        }
    }

    // Méthode pour vérifier l'état de la lampe (allumée ou éteinte). Retourne true si la lampe est allumée.
    public boolean isOn(){
        return isOn;
    }

    // Méthode pour obtenir l'intensité actuelle de la lampe. Retourne la valeur de l'intensité.
    public int getIntensity() {
        return intensity;
    }
}
