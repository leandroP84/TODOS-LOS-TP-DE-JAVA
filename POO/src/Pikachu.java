

public class Pikachu extends Pokemon implements IElectrico {

    //constructores
    public Pikachu() {}

    //metodos abstractos heredados
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu, placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu, araniazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu, mordisco!");
    }


    //interfaces heredadas
    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu, impactrueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu, punio trueno!");
    }
    //@overrride
    //trae los metodos abstractos de clases abstractas e interfaces, para poder agregarles procedimiento.
}
