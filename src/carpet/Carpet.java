package carpet;

public class Carpet {
    double cost;

    //Carpet method
    public Carpet(double cost)
    {
        this.cost = cost <0 ? 0 : cost;
    }

    //getCost method
    public  double getCost(){
        return cost;
    }
}
