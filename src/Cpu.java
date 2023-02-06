public class Cpu implements iComponent{
    Double price;
    public Cpu (Double i){
        this.price = i;
    }
    @Override
    public Double GetPrice() {
        // TODO Auto-generated method stub
        return price;
    }
}
