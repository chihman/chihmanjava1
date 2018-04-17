import lab14.task8403.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pro-28 on 17.04.2018.
 */

public class lab14 {
    @Test
    public void test8403case1(){
        Point p = new Point();
        p.x = 0;
        p.y = 0;
        double dist = p.distanceTo(4,3);

Assert.assertEquals(5,dist,0.001);
    }
    @Test
    public void test8403case2(){
        Point p = new Point();
        p.x = 0;
        p.y = 0;
        double dist = p.distanceTo(0,0);

        Assert.assertEquals(0,dist,0.001);
    }
}
