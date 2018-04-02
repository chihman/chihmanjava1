package DomLabs;
import DomLab_task.dom_task13_7237;
public  class dom_lab13_7237{
        public static void main(String[] args) {
            try {
                double x = dom_task13_7237.task13_7237(0); //ссылка
                System.out.printf("%.4f \n",x);
            } catch (IllegalAccessError e) {

                System.out.println(e.getMessage());
            }

                try {
                    double x = dom_task13_7237.task13_7237(-273.16); //ссылка
                    System.out.printf("%.4f \n",x);
                } catch (IllegalAccessError e) {

                    System.out.println(e.getMessage());
                }
}}
