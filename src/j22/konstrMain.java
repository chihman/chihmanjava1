package j22;

import J2.konstruktor;

public class konstrMain {
    public static void main(String[] args) {

        konstruktor kons = new konstruktor(1024,"Samsung","GSM");
       kons.setName("iPhone");

        System.out.println("Phone.getKons() = "+ kons.getType());
        System.out.println( kons.getName());
    }
}
