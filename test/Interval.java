
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pro-28 on 17.04.2018.
 */
public class Interval {

        @Test
        public void test5449case1(){
            Interval i1 = new Interval(0, 15);
            Interval i2 = new Interval(15, 30);
            if (i1.equals(i2)){
                System.out.println("Эквивалентны");
            } else {
                System.out.println("Не эквивалентны");
            }
            boolean dist=i1.equals(i2);
            Assert.assertEquals(true,dist);
        }
    }

