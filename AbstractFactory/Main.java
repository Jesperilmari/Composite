public class Main {
    public static void main(String[] args){
        VaatteidenKayttaja mies = new VaatteidenKayttaja();
        VaatteidenKayttaja nainen = new VaatteidenKayttaja();
        iClothesFactory factory = new BossFactory();
        iClothesFactory toinenFactory = new AdidasFactory();
        mies.hattu = factory.createHat();
        mies.housut = factory.createPants();
        mies.paita = factory.createShirt();
        mies.shoes = factory.createShoes();
        nainen.hattu = toinenFactory.createHat();
        nainen.housut = toinenFactory.createPants();
        nainen.paita = toinenFactory.createShirt();
        nainen.shoes = toinenFactory.createShoes();

        mies.tulostaVaatteet();
        nainen.tulostaVaatteet();
    }
}
