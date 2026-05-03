package examples.dependencyInjection;

import examples.dependencyInjection.ustensile.Cuisine;
import examples.dependencyInjection.ustensile.Recipient;

public class PateFeuilletee implements IPate {

    String[] ingredients = {"farine", "beurre", "eau", "sel"};

    @Override
    public void preparer() {
        Recipient recipient = Cuisine.getRecipient();
        for (String ingredient : ingredients) {
            recipient.ajouter(ingredient);
        }
        recipient.melanger();

        for (int i = 0; i < 6; i++) {
            this.plier();
            this.etaler();
            this.placerAuFroid();
        }
    }

    @Override
    public void abaisser(){
        System.out.println("Pâte abaissée");
    }

    private void placerAuFroid() {}
    private void etaler() {}
    private void plier() {}

    @Override
    public boolean estCuite() {
        return true;
    }

}
