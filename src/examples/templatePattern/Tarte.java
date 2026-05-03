package examples.templatePattern;

import examples.templatePattern.ustensile.Cuisine;
import examples.templatePattern.ustensile.MouleATarte;
import examples.templatePattern.ustensile.Recipient;

public abstract class Tarte implements IRecette {

    private Pate pate;
    private MouleATarte moule;
    private int dureeCuisson;
    private int temperatureFour;

    protected Tarte(int temperatureFour, int dureeCuisson) {
        this.temperatureFour = temperatureFour;
        this.dureeCuisson = dureeCuisson;
    }

    // Méthode template
    @Override
    public void preparer() {
        this.prechaufferFour(temperatureFour);
        this.preparerPate();
        this.preparerMoule();
        // Appel des méthodes abstraites
        this.preparerGarniture();
        this.ajouterGarniture();

        this.enfourner(dureeCuisson);
        while (!verifierCuisson()) {
            this.enfourner(5);
        }
        this.messageFin();
    }

    protected void prechaufferFour(int temperature){
        Cuisine.getFour().prechaufferFour(temperature);
    }

    protected boolean verifierCuisson() {
        return this.pate.estCuite();
    }

    protected void preparerPate() {
        Recipient recipient = Cuisine.getRecipient();
        recipient.ajouter("farine");
        recipient.ajouter("oeuf");
        recipient.ajouter("beurre");
        this.pate = new Pate(recipient.getContenu());
    }

    protected void preparerMoule() {
        this.moule = Cuisine.getMouleATarte();
        moule.setPate(this.pate);
    }

    protected void enfourner(int duration) {
        Cuisine.getFour().enfourner(moule);
    }

    protected abstract void preparerGarniture();
    protected abstract void ajouterGarniture();
    protected abstract void messageFin();
}
