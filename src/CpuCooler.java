public class CpuCooler implements iComponent{
    Double price;
    public CpuCooler (Double i){
        this.price = i;
    }
    @Override
    public Double GetPrice() {
        // TODO Auto-generated method stub
        return price;
    }
}
