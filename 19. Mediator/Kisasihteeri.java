import java.util.ArrayList;
import java.util.List;

public class Kisasihteeri implements Mediator {
    private final List<Tuomari> tuomarit;
    private final Mittamies mittamies;
    private final Tulostaulu tulostaulu;

    public Kisasihteeri() {
        this.tuomarit = new ArrayList<>();
        this.mittamies = new Mittamies();
        this.tulostaulu = new Tulostaulu();
    }

    @Override
    public void lisaaTuomari (Tuomari tuomari) {
        this.tuomarit.add(tuomari);
    }

    @Override
    public void mittaaHyppy(Hyppy hyppy) {
        double pituus = this.mittamies.mittaaPituus(hyppy);
        String nimi = hyppy.getHyppaaja().getNimi();
        List<Integer> pisteet = new ArrayList<>();
        for (Tuomari tuomari : this.tuomarit) {
            int pisteetTuomarilta = tuomari.annaTyyliPisteet();
            pisteet.add(pisteetTuomarilta);
        }
        this.tulostaulu.lisaaTulos(new Tulosrivi(nimi, pituus, pisteet));
    }

    @Override
    public void lisaaTulos(Tulosrivi rivi) {
        this.tulostaulu.lisaaTulos(rivi);
    }

    @Override
    public void tulostaTulokset() {
        this.tulostaulu.tulostaTulokset();
    }
}
