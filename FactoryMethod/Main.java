package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus kissa = new Kissa();
        oppilas.aterioi();
        opettaja.aterioi();
        kissa.aterioi();
    }
}
