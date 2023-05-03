public interface Mediator {
    void lisaaTuomari(Tuomari tuomari);

    void mittaaHyppy(Hyppy hyppy);

    public void lisaaTulos(Tulosrivi rivi);
    public void tulostaTulokset();
}