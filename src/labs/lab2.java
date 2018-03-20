package labs;

public class lab2 {
    public static double task4411(double x) {
        double a;
        a = x + 7;
        return a;
    }

    public static double task8428(double aInDeg) {
        double aInRad;
        aInRad = aInDeg * Math.PI / 180;
        return aInRad;
    }

    public static double task7711(double xInDeg) {

        double result;
        double x = lab2.task8428(xInDeg);
        result = Math.sin(x);
        return result;


    }


}
