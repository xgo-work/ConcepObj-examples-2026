package examples.dependencyInjection;

import examples.dependencyInjection.ustensile.Cuisine;
import examples.dependencyInjection.ustensile.MouleATarte;

public class Tarte implements IRecette {

    private IPate pate;
    private IGarnitureTarte garniture;
    private MouleATarte moule;
    private String nomRecette;
    private int dureeCuisson;
    private int temperatureFour;

    protected Tarte(int temperatureFour, int dureeCuisson, IPate pate, IGarnitureTarte garniture, String nomRecette) {
        this.temperatureFour = temperatureFour;
        this.dureeCuisson = dureeCuisson;
        this.pate = pate;
        this.garniture = garniture;
        this.nomRecette = nomRecette;
    }

    @Override
    public void preparer() {
        // logique de preparation de la pate encapsulée dans IPate
        this.pate.preparer();
        this.prechaufferFour(temperatureFour);
        this.pate.abaisser();

        this.preparerMoule();

        // logique garniture encapsulée dans IGarniture
        this.garniture.preparerGarniture();
        this.garniture.ajouterGarniture();

        this.enfourner(dureeCuisson);
        while (!verifierCuisson()) {
            this.enfourner(5);
        }
        this.messageFin();
    }

    private void prechaufferFour(int temperature){
        Cuisine.getFour().prechaufferFour(temperature);
    }

    private boolean verifierCuisson() {
        return this.pate.estCuite();
    }

    private void preparerMoule() {
        this.moule = Cuisine.getMouleATarte();
        moule.setPate(this.pate);
    }

    private void enfourner(int duration) {
        Cuisine.getFour().enfourner(moule);
    }

    private void messageFin() {
        System.out.println(this.nomRecette + " prêt(e)");
    }
}
