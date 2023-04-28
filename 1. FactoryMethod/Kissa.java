package factorymethod;

public class Kissa extends AterioivaOtus{
    @Override
    public Juoma createJuoma() {
        return new Maito();
    }
}
