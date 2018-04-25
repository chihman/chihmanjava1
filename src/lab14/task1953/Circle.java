package lab14.task1953;

/**
 * Created by pro-28 on 25.04.2018.
 */
public class Circle {
    private int x;
    private int y;
    private int w;

    public Circle(int x, int y, int w) {
        this.x = x;
        this.y = y;
        this.w = w;

    }

    public Object area() {
        this.w = w;
        double a = 2 * 3.14 * w;
        return a;
    }
}
