package examples.templatePattern;

public class Main {

    public static void main(String[] args) {
        TartePomme tartePomme = new TartePomme();
        tartePomme.preparer();

        Quiche quiche = new Quiche();
        quiche.preparer();
        /**
         * *** Exercice Implementer le pattern Method Template ***
         * DONE 1. Créer une classe abstraite Tarte
         * DONE 2. Transférer toutes les méthodes communes à TartePomme & Quiche dans la classe Tarte
         * 3. Créer des méthodes abstraites dans Tarte pour les étapes spécifiques à chaque recette
         * (par exempte: preparerGarniture(), ajouterGarniture())
         * 4. Implémenter les méthodes abstraites dans les classes TartePomme & Quiche
         * 5. Implémentez la méthode preparer() dans la classe Tarte (template method) qui appelle les différentes étapes de préparation dans le bon ordre
         *
         * 6. Pour l'exemple, créez une nouvelle recette TarteNoisettes qui étend Tarte
         */
    }
}
