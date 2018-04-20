package J2;
import j22.Car;
import j22.Door;
public class MainCarSetGet {
    public static void main(String[] args) {
        Car auto = new Car();
        auto.setName("Toyota");
        auto.setColor("red");
        auto.setHeight(33);
        Door autoDoor = new Door();
        autoDoor.setColor("RED");
        autoDoor.setModel("Toyota");
        System.out.println("car.getName() = " + auto.getName()+" "+auto.getColor()+" "+auto.getHeight());
        System.out.println("Door = "+ autoDoor.getColor()+" "+autoDoor.getModel());
    }
}
