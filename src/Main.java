import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafe cafe = new Cafe();
        System.out.println("Choississez votre café : oui où non");
        String r = sc.nextLine();
        boolean fini = false;
        if (r.equals("oui")){
            while (!fini){
                System.out.println("Votre café actuel: " + cafe.description() + " - Coût: " + cafe.cout() + "€");
                System.out.println("Ajouter des ingrédients: 1) Lait à,8€, 2) Sucre 0,5€, 3) Caramel 0,9€, 4) Terminer");
                System.out.print("Votre choix: ");
                int choix = sc.nextInt();

                switch (choix){
                    case 1:
                        cafe = new Lait(cafe);
                        break;
                    case 2:
                        cafe = new Sucre(cafe);
                        break;
                    case 3:
                        cafe = new Caramel(cafe);
                        break;
                    case 4:
                        fini = true;
                        break;
                    default:
                        System.out.println("Choix invalide, veuillez réessayer.");
                }
            }
        }
        System.out.println("Votre boisson personnalisée: " + cafe.description() + " - Coût total: " + cafe.cout() + "€");
        sc.close();
    }
}
