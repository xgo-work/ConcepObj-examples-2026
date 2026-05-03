package examples.dependencyInjection;

public class Main {

    public static void main(String[] args) {
        TartePomme tartePomme = new TartePomme();
        tartePomme.preparer();

        System.out.println("====================================");

        Quiche quiche = new Quiche();
        quiche.preparer();

        System.out.println("====================================");

        TarteNoisettes tarteNoisettes = new TarteNoisettes();
        tarteNoisettes.preparer();

    }
}
