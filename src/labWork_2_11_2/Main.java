package labWork_2_11_2;

/**
 * Created by Bulik on 06.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("My exeption");
        }catch (Exception ex){
            ((MyException)ex).printMessege();
        }
        //MyTest myTest = null;
        MyTest myTest = new MyTest();
        try {
            myTest.test();
        }/*catch (NullPointerException ee){
            System.out.println("null");
        }*/catch (MyException | NullPointerException exp){
            //exp.printMessege();
            exp.printStackTrace();
        }
    }
}
