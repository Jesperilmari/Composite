public class Psu implements iComponent{
    Double price;
    public Psu (Double i){
        this.price = i;
    }
    @Override
    public Double GetPrice() {
        // TODO Auto-generated method stub
        return price;
    }
}
