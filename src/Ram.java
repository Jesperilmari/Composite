public class Ram implements iComponent{
    Double price;
    public Ram (Double i){
        this.price = i;
    }
    @Override
    public Double GetPrice() {
        // TODO Auto-generated method stub
        return price;
    }
}
