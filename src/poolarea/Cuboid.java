package poolarea;

public class Cuboid extends Rectangle {
    double height;

    //constructor with three parameters width, length, and height all of type double
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    //getWidth method
    public double getWidth() {
        return super.getWidth();
    }
    //getArea Method
    public double getArea() {
        return super.getArea();
    }

    //getHeight method
    public double getHeight() {
        return height;
    }

    // getVolume Method without any parameters
    public double getVolume() {
        return getArea()* height;
    }
}
