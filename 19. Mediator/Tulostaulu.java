public class Tulostaulu {
    public void naytaTulokset(Tulosrivi[] rivit) {

    }
    public void lisaaTulos(Tulosrivi rivi) {

    }
    public void tulostaTulokset() {
        Tulosrivi[] rivit = new Tulosrivi[3];
        int hyppy = Mittamies.mittaaPituus(Hyppy.getHyppy());
        int tyylipisteet = Tuomari.annaTyyliPisteet();
        String nimi = Hyppaaja.getNimi();
        System.out.println("Hyppääjän " + nimi + " hyppy oli pituudeltaan " + hyppy + " metriä ja tyylipisteet olivat " + tyylipisteet + " pistettä.");
    }
}