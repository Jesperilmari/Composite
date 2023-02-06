public class NetworkCard implements iComponent{
    Double price;
    public NetworkCard (Double i){
        this.price = i;
    }
    @Override
    public Double GetPrice() {
        // TODO Auto-generated method stub
        return price;
    }
}
