package lab12;

import labs.lab2;

public class task2354 {
    public static void main(String[] args) {

        double a1 = lab2.task4411(11.13);
        System.out.printf("%.4f \n", a1);
        a1 = lab2.task4411(-7919);
        System.out.printf("%.4f \n", a1);
        a1 = lab2.task4411(0);
        System.out.printf("%.4f \n", a1);

        double aInRad = lab2.task8428(45);
        aInRad = lab2.task8428(1125);
        System.out.println("RAD:");
        System.out.printf("%.4f \n", aInRad);
        aInRad = lab2.task8428(0);
        System.out.println("RAD:");
        System.out.printf("%.4f \n", aInRad);
        aInRad = lab2.task8428(360);
        System.out.println("RAD:");
        System.out.printf("%.4f \n", aInRad);
        aInRad = lab2.task8428(90);
        System.out.println("RAD:");
        System.out.printf("%.4f \n", aInRad);
        aInRad = lab2.task8428(2000);
        System.out.println("RAD:");
        System.out.printf("%.4f \n", aInRad);

        double result = lab2.task7711(45);
        System.out.println("Sin:");
        System.out.printf("%.4f \n", result);
        result = lab2.task7711(1125);
        System.out.println("Sin:");
        System.out.printf("%.4f \n", result);result = lab2.task7711(2000);
        result = lab2.task7711(7639);
        System.out.println("Sin:");
        System.out.printf("%.4f \n", result);


    }
}



