public class Bulbasaur extends Pokemon implements IPlanta
{

    //constructores
    public Bulbasaur(){}


    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur, placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur, araniazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur, mordisco!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur, drenaje!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur, paralizar!");
    }
}
