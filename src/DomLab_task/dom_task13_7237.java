package DomLab_task;

public class dom_task13_7237 {
    public static double task13_7237(double x) throws IllegalAccessError {
        if (x <= -273.16) {
            IllegalAccessError ex = new IllegalAccessError("температура ниже абсолютного нуля ");
            throw ex;
        }
        double a;
        a = x * 1.8 + 32;
        return a;
    }
}

