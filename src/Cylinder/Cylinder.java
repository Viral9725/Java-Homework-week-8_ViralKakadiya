package Cylinder;

//Cylinder class and it extends Circle class
public class Cylinder extends Circle
{
    double height;

    //constructor with two parameters radius and height both of type double.
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0: height;
    }
    //Method named getHeight without any parameters, it needs to return the value of height field

    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
