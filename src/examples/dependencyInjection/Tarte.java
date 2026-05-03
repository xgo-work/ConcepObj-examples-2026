package examples.dependencyInjection;

import examples.dependencyInjection.ustensile.Cuisine;
import examples.dependencyInjection.ustensile.MouleATarte;

public abstract class Tarte implements IRecette {

    private PateBrisee pate;
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
        this.pate.abaisser();

        this.preparerMoule();
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
        this.pate = new PateBrisee();
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
