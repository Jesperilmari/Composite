public class AdidasFactory implements iClothesFactory {
    @Override
    public String createHat() {
        return "adidasHattu";
    }

    @Override
    public String createShirt() {
        return "adidasPaita";
    }

    @Override
    public String createPants() {
        return "adidasHousut";
    }

    @Override
    public String createShoes() {
        return "adidasKengat";
    }
}
