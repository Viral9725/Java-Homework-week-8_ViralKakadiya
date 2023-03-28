package poolarea;

public class Rectangle {
   double width;
   double length;

   //Rectangle constructor with parameters width and length both of type double
    public Rectangle(double width, double length)
    {
        this.width = width<0 ? 0: width;;
        this.length = length<0 ? 0: length;
    }
    //Method getWidth without any parameters
    public double getWidth()
    {
        return this.width;
    }
    //getLength method without any parameters,
    public double getLength()
    {
        return this.length;
    }
    //getArea method without any parameters
    public double getArea()
    {
        return this.width * this.length;
    }
}
