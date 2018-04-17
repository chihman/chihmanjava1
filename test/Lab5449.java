import lab14.task5449.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pro-28 on 17.04.2018.
 */
public class Lab5449 {
    @Test
    public void test5449case1(){
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);

        boolean dist=a.equals(b);
        Assert.assertEquals(true,dist);
    }
    @Test
    public void test5449case2(){
    Point c = new Point(15, 17);
    Point d = new Point(15, 17);
        if (d == c){
        System.out.println("Равны");
    } else {
            System.out.println("Не равны");
        }

        boolean dist=(d==c);
        Assert.assertEquals(false,dist);
    }
    @Test
            public void  test5449case3(){
    Point f = new Point(83, 61);
    Point h = f;
        if (f == h){
        System.out.println("Равны");
    } else {
        System.out.println("Не равны");
    }
        boolean dist=(f==h);
        Assert.assertEquals(true,dist);
    }
    @Test
    public void  test5449case4() {
        Point i = new Point(13, 13);
        if (i.equals(null)){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
        boolean dist=(i.equals(null));
        Assert.assertEquals(false,dist);

    }
    @Test
    public void  test5449case5() {
        Point j = new Point(59, 59);
        if(j.equals("(59;59)")){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
        boolean dist=(j.equals("(59;59)"));
        Assert.assertEquals(false,dist);
    }

    @Test
    public void  test5449case6() {
        Point k = new Point(1097, 691);
        if(k.equals(k)){
            System.out.println("Эквивалентны");
        } else {
            System.out.println("Не эквивалентны");
        }
        boolean dist=(k.equals(k));
        Assert.assertEquals(true,dist);
    }


}
