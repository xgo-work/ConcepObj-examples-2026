package examples.dependencyInjection;

public class Main {

    public static void main(String[] args) {
        TartePomme tartePomme = new TartePomme(new PateFeuilletee());
        tartePomme.preparer();

        System.out.println("====================================");

        Quiche quiche = new Quiche(new PateBrisee());
        quiche.preparer();

        System.out.println("====================================");

        TarteNoisettes tarteNoisettes = new TarteNoisettes(new PateFeuilletee());
        tarteNoisettes.preparer();

    }
}
