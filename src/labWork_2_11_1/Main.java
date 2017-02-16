package labWork_2_11_1;

/**
 * Created by Bulik on 06.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
           // throw new Exception("Demo test");
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }finally {
            System.out.println("Finally");
        }

    }
}
