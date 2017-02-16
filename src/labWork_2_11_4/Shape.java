package labWork_2_11_4;

/**
 * Created by Bulik on 29.07.2016.
 */
public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+", color is :" + shapeColor ;
    }

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape)o;
        if (this.calcArea() > shape.calcArea())
        return 1;
        if (this.calcArea() < shape.calcArea())
            return -1;
        return 0;
    }

    @Override
    public void draw() {
            System.out.println(this + ", area is: " + this.calcArea());
    }

    public abstract double calcArea();

   public static Shape parseShape(String str) throws InvalidShapeStringException{
       Shape shape= null;
       String[] tokens = str.split("[:,]");
       switch (tokens[0]){
           case "Rectangle":

               shape = Rectangle.parseRectangle(str);
               break;
           case "Triangle":

               shape = Triangle.parseTriangle(str);
               break;
           case "Circle":

               shape = Circle.parseCircle(str);
               break;
           default:
               throw new InvalidShapeStringException();

       }
       return shape;
   }

}
