package labs;

public class lab13 {

    public static double task9020(int x) throws IllegalAccessError {
        if (x > 61) {
            IllegalAccessError ex = new IllegalAccessError("x>61");
            throw ex;
        }
        double a;
        a = 3 * Math.sqrt(61 - x);
        return a;
    }
}
