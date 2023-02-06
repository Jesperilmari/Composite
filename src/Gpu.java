public class Gpu implements iComponent{
    Double price;
    public Gpu (Double i){
        this.price = i;
    }
    @Override
    public Double GetPrice() {
        // TODO Auto-generated method stub
        return price;
    }
}
