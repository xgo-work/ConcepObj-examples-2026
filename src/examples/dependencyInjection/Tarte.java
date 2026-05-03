package examples.dependencyInjection;

import examples.dependencyInjection.ustensile.Cuisine;
import examples.dependencyInjection.ustensile.MouleATarte;

public abstract class Tarte implements IRecette {

    private IPate pate;
    private MouleATarte moule;
    private int dureeCuisson;
    private int temperatureFour;

    protected Tarte(int temperatureFour, int dureeCuisson, IPate pate) {
        this.temperatureFour = temperatureFour;
        this.dureeCuisson = dureeCuisson;
        this.pate = pate;
    }

    // Méthode template
    @Override
    public void preparer() {
        // logique de preparation de la pate encapsulée dans IPate
        this.pate.preparer();
        this.prechaufferFour(temperatureFour);
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
