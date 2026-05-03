package examples.dependencyInjection;

// Corrigé partie I & II
public class Main {

    public static void main(String[] args) {
        Tarte tartePomme = new Tarte(200, 45, new PateFeuilletee(), new GarnitureTartePomme(), "Tarte aux pommes");
        tartePomme.preparer();

        System.out.println("====================================");

        Tarte quiche = new Tarte(190,40, new PateBrisee(), new GarnitureQuiche(), "Quiche fromage");
        quiche.preparer();

        System.out.println("====================================");

        Tarte tarteNoisettes = new Tarte(180, 30, new PateFeuilletee(), new GarnitureTarteNoisettes(), "Tarte aux noisettes");
        tarteNoisettes.preparer();

    }
}
