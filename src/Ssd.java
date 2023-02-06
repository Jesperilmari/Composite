public class Ssd implements iComponent{
    Double price;
    public Ssd (Double i){
        this.price = i;
    }
    @Override
    public Double GetPrice() {
        // TODO Auto-generated method stub
        return price;
    }
}
