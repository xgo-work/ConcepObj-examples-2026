package examples.templatePattern;

public class Quiche extends Tarte{

    public Quiche() {
        super(190, 40);
    }

    private void ajouterLaitetOeufs() {}

    private void raperFromage() {}

    @Override
    protected void preparerGarniture() {
        raperFromage();
        ajouterLaitetOeufs();
    }

    @Override
    protected void ajouterGarniture() {
    }

    @Override
    protected void messageFin() {
        System.out.println("Quiche prête !");
    }

}


