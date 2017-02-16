package labWork_2_11_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InvalidShapeStringException {


            Shape rectangle = Shape.parseShape("Rectangle:RED:10,20");
            Shape triangle = Shape.parseShape("Triangle:GREEN:9,7,12");
            Shape circle = Shape.parseShape("Circle:BLACK:10");
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Enter size -> :");
            int size = Integer.parseInt(scanner.next());
            Shape[] shapes = new Shape[size];
            for ( int i = 0; i<shapes.length; i++){
                System.out.print("Enter shape "+(i+1) + " -> :");
                shapes[i] = Shape.parseShape(scanner.next());
            }

        }catch (InvalidShapeStringException exp){
            System.out.println("Invalid string!!!");
        }




    }

}
