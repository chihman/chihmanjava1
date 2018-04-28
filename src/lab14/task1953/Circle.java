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
    @Override
    public String toString() {
        return "<circle cx=" + x  +
                " cy=" + y +
                " r=" + w +
                "/>";//переопределили метод тустринг
    }
    public Object area() {
        this.w = w;
        double a = 2 * 3.14 * w;
        return a;
    }





    public Interval getProjectionX() {
            return new Interval( this.x - this.w, this.x + this.w );
    }
    public Interval getProjectionY() {
        return new Interval( this.y - this.w, this.y + this.w );
    }


}
