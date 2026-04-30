package examples.singleton;

public class Main {
    public static void main(String[] args) {
        //Game game1 = new Game();
        //Game game2 = new Game();

        //System.out.println(game1);
        //System.out.println(game2);
        // Les deux instances sont différentes, c'est à dire que les deux références pointent vers des objets différents.
        // On le voit grâce à l'adresse mémoire affichée dans la console.

        // EXERCICE : faire de cette classe un singleton avec une methode getInstance()
        // Après modification, le code ci-dessus ne doit plus compiler. (vous pouvez l'effacer ou le commenter)
        // Après modification décommentez le code en dessous
        Game game3 = Game.getInstance();
        Game game4 = Game.getInstance();
        System.out.println(game3);
        System.out.println(game4);

        if(game3 == game4){
            System.out.println("Les deux instances sont identiques! Implémentation du singleton réussie");
        } else {
            System.out.println("!!! Les deux instances sont différentes! Il y a une erreur dans la mise en place du singleton");
        }

        // Verification : les deux instances doivent être identiques, c'est à dire que les deux références pointent vers le même objet.
        // On le voit grâce à l'adresse mémoire affichée dans la console, qui doit être la même pour les deux références.

    }
}
