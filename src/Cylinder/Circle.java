package Cylinder;

//Circle class
public class Circle
{
    double radius;

    //Circle constructor
    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    //getRadius method without any parameters, it needs to return the value of the radius field.
    public double getRadius()
    {
        return radius;
    }

    // getArea method without any parameters, it needs to return the calculated area (radius * radius * PI).
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
}