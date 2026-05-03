package examples.dependencyInjection;

public class Quiche extends Tarte{

    public Quiche() {
        super(190, 40);
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


