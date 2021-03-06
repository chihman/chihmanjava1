package lab14.task8403;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Point {
    public int x;
    public int y;
    public double distanceTo(int px, int py){
        int dx = px - this.x;
        int dy = py - y;

        return Math.sqrt(dx*dx + dy*dy);
    }
}
