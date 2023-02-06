import java.util.ArrayList;
import java.util.List;

public class MotherBoard implements iComponent{
    Double price;
    private List <iComponent> componentList;

    public void addComponent(iComponent k) {
		componentList.add(k);
    }

    public MotherBoard (Double i){
        this.price = i;
        this.componentList = new  ArrayList<>();
    }
    @Override
    public Double GetPrice() {
        Double sum = price;
        for(int i = 0; componentList.size()>i; i++){
            sum += componentList.get(i).GetPrice();
        }
        // TODO Auto-generated method stub
        return sum;
    }
}
