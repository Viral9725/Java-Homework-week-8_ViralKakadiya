package carpet;

public class Calculator {
    Floor floor;

    Carpet carpet;


    //Calculator method
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    //getTotalCost method
    public double getTotalCost(){
        return floor.getArea() * carpet.cost;
    }
}
