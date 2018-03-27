
package lab12;

import labs.lab13;


public class task9020 {

    public static void main(String[] args) {
        try {

            double x = lab13.task9020(0);
            System.out.println(x);
        } catch (IllegalAccessError e) {

            System.out.println(e.getMessage());
        }

        try {

            double x = lab13.task9020(-9);
            System.out.println(x);
        } catch (IllegalAccessError e) {

            System.out.println(e.getMessage());
        }


        try {

            double x = lab13.task9020(62);
            System.out.println(x);
        } catch (IllegalAccessError e) {

            System.out.println(e.getMessage());
        }
    }
}
