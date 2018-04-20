package j22;

public class NasledovanieCamri50 extends NasledovanieCamri30 {
    public void light(){
        super.stop();
        System.out.println("Stop camri 50");

}
   @Override
    public void drive() {
     //   super.drive();
        System.out.println("Override Camri50");
    }
}

