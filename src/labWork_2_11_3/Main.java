package labWork_2_11_3;

/**
 * Created by Bulik on 06.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(0);
        }catch (InvalidAgeException exp){
            System.out.println("Invalid age!!!");
        }

    }
}
