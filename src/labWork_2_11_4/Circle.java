package labWork_2_11_4;

/**
 * Created by Bulik on 29.07.2016.
 */
public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +", radius =" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI* radius* radius;
    }

    public static Circle parseCircle (String str){
        String[] tokens = str.split("[:,]");
        return new Circle(tokens[1], Double.parseDouble(tokens[2]));
    }
}

