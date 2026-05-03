package examples.dependencyInjection;

public class Quiche extends Tarte{

    public Quiche(IPate pate) {
        super(190,40,pate);
    }

    private void ajouterLaitEtOeufs() {}

    private void raperFromage() {}

    @Override
    protected void preparerGarniture() {
        raperFromage();
        ajouterLaitEtOeufs();
    }

    @Override
    protected void ajouterGarniture() {
    }

    @Override
    protected void messageFin() {
        System.out.println("Quiche prête !");
    }

}


