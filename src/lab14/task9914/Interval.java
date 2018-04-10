package lab14.task9914;


/**
 * Created by pro-28 on 03.04.2018.
 */
public class Interval {
    public int a;
    public int b;
    boolean c;

    public boolean intersects(Interval r) {
        if( r == null){
            throw new IllegalArgumentException("Конечная точка не инициализирована");
        }

        if (this .a <= r.a && this.a >= r.b||this .b <= r.a && this.b >= r.b) {
            c = true;

        } else {
            c = false;
        }
        return c;

    }

}
