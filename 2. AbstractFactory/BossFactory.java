public class BossFactory implements iClothesFactory{
    @Override
    public String createHat() {
        return "bossHattu";
    }

    @Override
    public String createShirt() {
        return "bossShit";
    }

    @Override
    public String createPants() {
        return "bossPants";
    }

    @Override
    public String createShoes() {
        return "bossShoes";
    }
}
