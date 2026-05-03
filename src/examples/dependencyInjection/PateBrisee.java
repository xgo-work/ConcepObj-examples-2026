package examples.dependencyInjection;

import examples.dependencyInjection.ustensile.Cuisine;
import examples.dependencyInjection.ustensile.Recipient;

public class PateBrisee {

    String[] ingredients = {"farine", "beurre", "eau", "sel"};

    public void preparer() {
        Recipient recipient = Cuisine.getRecipient();
        for (String ingredient : ingredients) {
            recipient.ajouter(ingredient);
        }
        recipient.melanger();
    }

    public void abaisser(){
        System.out.println("Pâte abaissée");
    }

    public boolean estCuite() {
        //... logique de cuisson
        return true;
    }
}
