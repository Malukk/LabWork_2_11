package labWork_2_11_5;

public class Main {
    public static void main(String[] args) {
        byte bb = 23;
        int ii = -100;
        assert -77 == compute(bb, ii) : "compute failed";
    }

    static Long compute(Byte arg_1, Integer arg_2){
//        long result = arg_1 + arg_2;
//        return new Long(result);

        Long result = (long)(arg_1 + arg_2);
       // return result;
        return 0L;
    }
}