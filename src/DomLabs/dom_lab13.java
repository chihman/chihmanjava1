package DomLabs;
import DomLab_task.dom_task13;//ссылка
public class dom_lab13 {
    public static void main(String[] args) {
        try {
            double x = dom_task13.task9020(0); //ссылка
            System.out.printf("%.4f \n",x);
        } catch (IllegalAccessError e) {

            System.out.println(e.getMessage());
        }


        try {
            double x = dom_task13.task9020(62);
            System.out.printf("%.4f \n",x);
        } catch (IllegalAccessError e) {

            System.out.println(e.getMessage());
        }
        try {
            double x = dom_task13.task9020(7573);
            System.out.printf("%.4f \n",x);
        } catch (IllegalAccessError e) {

            System.out.println(e.getMessage());
        }
    }
}


