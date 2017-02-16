package labWork_2_11_2;

/**
 * Created by Bulik on 06.08.2016.
 */
public class MyException extends Exception {
    private String message;

    public MyException(String message) {
        this.message = message;
    }
    public void printMessege(){
        System.out.println(message);
    }
}
