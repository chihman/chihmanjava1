package DomLab_task;
public class dom_task13 {
    public static double task9020(int x) throws IllegalAccessError {
        if (x > 61) {
            IllegalAccessError ex = new IllegalAccessError("x>61");
            throw ex;//что делает?
        }
        double a;
        a = 3 * Math.sqrt(61 - x);
        return a;
    }
}
